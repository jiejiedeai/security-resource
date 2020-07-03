package com.security.resource.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.security.resource.mapper.SsoResourceMapper;
import com.security.resource.model.SsoResource;
import com.security.resource.model.SsoResourceRoleDTO;
import com.security.resource.service.SsoResourceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 资源 服务实现类
 * </p>
 *
 * @author qp
 * @since 2020-01-23
 */
@Service
public class SsoResourceServiceImpl extends ServiceImpl<SsoResourceMapper, SsoResource> implements SsoResourceService {

    @Autowired
    private SsoResourceMapper ssoResourceMapper;


    /**
     * 获取所有的资源url和与之对应的角色名称列表
     *
     * @return
     */
    @Override
    public List<SsoResourceRoleDTO> findAllResourceRoleDTO() {
        return ssoResourceMapper.findAllResourceRoleDTO();
    }

}
