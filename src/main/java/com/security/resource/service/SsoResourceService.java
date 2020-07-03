package com.security.resource.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.security.resource.model.JsonResult;
import com.security.resource.model.SsoResource;
import com.security.resource.model.SsoResourceRoleDTO;

import java.util.List;

/**
 * <p>
 * 资源 服务类
 * </p>
 *
 * @author qp
 * @since 2020-01-23
 */
public interface SsoResourceService extends IService<SsoResource> {

	/**
	 * 获取所有的资源url和与之对应的角色名称列表
	 *
	 * @return
	 */
	List<SsoResourceRoleDTO> findAllResourceRoleDTO();
}
