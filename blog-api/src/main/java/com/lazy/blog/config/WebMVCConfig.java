package com.lazy.blog.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author lizhi
 * @Creat 2022-06-14:57
 * @Desc:
 **/
@Configuration
public class WebMVCConfig implements WebMvcConfigurer {
    //配置跨域
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080");
    }
}
