package com.lazy.blog.dao.pojo;

import lombok.Data;

/**
 * @Author lizhi
 * @Creat 2022-06-16:26
 * @Desc:
 **/
    @Data
    public class SysUser {

        private Long id;

        private String account;

        private Integer admin;

        private String avatar;

        private Long createDate;

        private Integer deleted;

        private String email;

        private Long lastLogin;

        private String mobilePhoneNumber;

        private String nickname;

        private String password;

        private String salt;

        private String status;
    }


