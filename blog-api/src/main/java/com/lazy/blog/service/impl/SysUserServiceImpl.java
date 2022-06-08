package com.lazy.blog.service.impl;

import com.lazy.blog.dao.mapper.SysUserMapper;
import com.lazy.blog.dao.pojo.SysUser;
import com.lazy.blog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author lizhi
 * @Creat 2022-06-19:17
 * @Desc:
 **/
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findUserById(Long id) {
        SysUser sysUser = sysUserMapper.selectById(id);
        if (sysUser == null) {
            sysUser = new SysUser();
            sysUser.setNickname("lalaal");
        }
        return sysUser;
    }
}
