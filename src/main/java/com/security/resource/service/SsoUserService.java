package com.security.resource.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.security.resource.model.JsonResult;
import com.security.resource.model.SsoUser;

public interface SsoUserService extends IService<SsoUser> {

    /** 查询用户列表 **/
    JsonResult<IPage<SsoUser>> searchUserList(Integer currtentPage, Integer size, String name);
}
