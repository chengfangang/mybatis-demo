package com.mybatis.test.dao;

import com.mybatis.test.entity.StuSubject;

public interface StuSubjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StuSubject record);

    int insertSelective(StuSubject record);

    StuSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StuSubject record);

    int updateByPrimaryKey(StuSubject record);
}