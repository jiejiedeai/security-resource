package com.security.resource.security;


import com.ht.dynamic.authority.SecurityMetadataSourceSupport;
import com.ht.dynamic.authority.UserAuthority;
import com.security.resource.model.SsoResourceRoleDTO;
import com.security.resource.service.SsoResourceService;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JdbcSecurityMetadataSourceSupport implements SecurityMetadataSourceSupport {

//    @Autowired
    private SsoResourceService ssoResourceService;

    public JdbcSecurityMetadataSourceSupport(SsoResourceService ssoResourceService) {
        this.ssoResourceService = ssoResourceService;
    }

    /**
     * 获取所有的URL以及对应的权限信息,用于持久化到Redis
     * @return
     */
    @Override
    public List<UserAuthority> getAllAuthority() {
        List<SsoResourceRoleDTO> resourceRoleDTOList = ssoResourceService.findAllResourceRoleDTO();
        if (CollectionUtils.isEmpty(resourceRoleDTOList)) {
            return Collections.emptyList();
        }
        List<UserAuthority> userAuthorities = resourceRoleDTOList.stream().map(ssoResourceRoleDTO -> {
            UserAuthority userAuthority = new UserAuthority();
            userAuthority.setUri(ssoResourceRoleDTO.getResourceUrl());
            userAuthority.setAuthorities(ssoResourceRoleDTO.getRoleIdList());
            return userAuthority;
        }).collect(Collectors.toList());
        return userAuthorities;
    }
}
