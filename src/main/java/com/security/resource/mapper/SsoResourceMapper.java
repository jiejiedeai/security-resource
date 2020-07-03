package com.security.resource.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.security.resource.model.SsoResource;
import com.security.resource.model.SsoResourceRoleDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 资源 Mapper 接口
 * </p>
 *
 * @author qp
 * @since 2020-01-23
 */
public interface SsoResourceMapper extends BaseMapper<SsoResource> {

    List<SsoResourceRoleDTO> findAllResourceRoleDTO();
}
