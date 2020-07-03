package com.security.resource.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.security.resource.model.SsoUser;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author qp
 * @since 2020-03-21
 */
public interface SsoUserMapper extends BaseMapper<SsoUser> {

    /**
     * 查询用户列表
     * @param page
     * @param name
     * @return
     */
    IPage<SsoUser> searchUserList(Page<SsoUser> page, @Param("name") String name);
}
