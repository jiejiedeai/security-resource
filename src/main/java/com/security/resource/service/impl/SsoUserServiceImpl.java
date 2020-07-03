package com.security.resource.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.security.resource.mapper.SsoUserMapper;
import com.security.resource.model.JsonResult;
import com.security.resource.model.SsoUser;
import com.security.resource.service.SsoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userServiceImpl")
public class SsoUserServiceImpl extends ServiceImpl<SsoUserMapper, SsoUser> implements SsoUserService {

    @Autowired
    private SsoUserMapper ssoUserMapper;

    @Override
    public JsonResult<IPage<SsoUser>> searchUserList(Integer currtentPage, Integer size, String name) {
        Page<SsoUser> page = new Page<>();
        page.setCurrent(currtentPage).setSize(size);
        IPage<SsoUser> userIPage = ssoUserMapper.searchUserList(page,name);
        return JsonResult.success(userIPage);
    }
}
