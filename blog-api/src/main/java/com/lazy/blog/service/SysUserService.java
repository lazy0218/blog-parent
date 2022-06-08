package com.lazy.blog.service;

import com.lazy.blog.dao.pojo.SysUser;



/**
 * @Author lizhi
 * @Creat 2022-06-19:14
 * @Desc:
 **/
public interface SysUserService {
    SysUser findUserById(Long id);
}
