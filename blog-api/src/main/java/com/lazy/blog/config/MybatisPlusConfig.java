package com.lazy.blog.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author lizhi
 * @Creat 2022-06-0:32
 * @Desc:
 **/
@Configuration
@MapperScan("com.lazy.blog.dao.mapper")
public class MybatisPlusConfig {
}
