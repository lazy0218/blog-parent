package com.lazy.blog.vo.Params;

import lombok.Data;

/**
 * @Author lizhi
 * @Creat 2022-06-16:34
 * @Desc:
 **/
@Data
public class PageParams {

    private int page = 1;

    private int pageSize = 10;
}
