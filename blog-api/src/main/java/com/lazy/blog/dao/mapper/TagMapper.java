package com.lazy.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lazy.blog.dao.pojo.Tag;


import java.util.List;

/**
 * @Author lizhi
 * @Creat 2022-06-16:30
 * @Desc:
 **/
public interface TagMapper extends BaseMapper<Tag> {
    List<Tag> findTagsByArticleId(Long articleId);
}
