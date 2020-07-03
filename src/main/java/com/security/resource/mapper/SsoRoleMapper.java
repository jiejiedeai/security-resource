package com.security.resource.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.security.resource.model.SsoRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author qp
 * @since 2020-01-23
 */
public interface SsoRoleMapper extends BaseMapper<SsoRole> {

    /**
     * 查询用户角色列表
     * @param userId
     * @return
     */
    List<SsoRole> searchUserRoles(
            @Param("userId") Integer userId);

    /**
     * 根据资源id获取对应得角色列表
     *
     * @param resourceId
     * @return
     */
    List<Integer> findRoleNameByResourceId(@Param("resourceId") Integer resourceId);
}
