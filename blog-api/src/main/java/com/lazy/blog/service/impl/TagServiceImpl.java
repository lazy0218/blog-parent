package com.lazy.blog.service.impl;


import com.lazy.blog.dao.mapper.TagMapper;
import com.lazy.blog.dao.pojo.Tag;
import com.lazy.blog.service.TagService;
import com.lazy.blog.vo.TagVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lizhi
 * @Creat 2022-06-19:04
 * @Desc:
 **/
@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagMapper tagMapper;

    public TagVo copy(Tag tag){
        TagVo tagVo = new TagVo();
        BeanUtils.copyProperties(tag,tagVo);
        return tagVo;
    }
    public List<TagVo> copyList(List<Tag> tagList){
        List<TagVo> tagVoList = new ArrayList<>();
        for (Tag tag : tagList) {
            tagVoList.add(copy(tag));
        }
        return tagVoList;
    }

    @Override
    public List<TagVo> findTagsByArticleId(Long articleId) {
        //多表查询mp不能实现
        List<Tag> tags = tagMapper.findTagsByArticleId(articleId);
        return copyList(tags);
    }



}
