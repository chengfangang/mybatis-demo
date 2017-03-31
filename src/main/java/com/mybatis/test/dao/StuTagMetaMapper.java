package com.mybatis.test.dao;

import com.mybatis.test.entity.StuTagMeta;

public interface StuTagMetaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StuTagMeta record);

    int insertSelective(StuTagMeta record);

    StuTagMeta selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StuTagMeta record);

    int updateByPrimaryKey(StuTagMeta record);
}