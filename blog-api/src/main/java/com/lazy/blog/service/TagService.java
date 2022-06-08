package com.lazy.blog.service;

import com.lazy.blog.vo.TagVo;

import java.util.List;

/**
 * @Author lizhi
 * @Creat 2022-06-18:54
 * @Desc:
 **/
public interface TagService {
    List<TagVo> findTagsByArticleId(Long articleId);
}
