package com.mybatis.test.dao;

import com.mybatis.test.entity.Stu;

public interface StuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Stu record);

    int insertSelective(Stu record);

    Stu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Stu record);

    int updateByPrimaryKey(Stu record);
}