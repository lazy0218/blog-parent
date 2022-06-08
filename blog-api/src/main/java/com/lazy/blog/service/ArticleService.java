package com.lazy.blog.service;

import com.lazy.blog.dao.pojo.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lazy.blog.vo.Params.PageParams;
import com.lazy.blog.vo.Result;

/**
 * <p>
 *  分页查询 文章列表
 * </p>
 *
 * @author Lizhi
 * @since 2022-06-08
 */
public interface  ArticleService  {

    Result listArticle(PageParams pageParams);
}
