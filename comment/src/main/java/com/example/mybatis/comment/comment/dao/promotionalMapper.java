package com.example.mybatis.comment.comment.dao;

import com.example.mybatis.comment.comment.pojo.promotional;

public interface promotionalMapper {
    int deleteByPrimaryKey(Integer promId);

    int insert(promotional record);

    int insertSelective(promotional record);

    promotional selectByPrimaryKey(Integer promId);

    int updateByPrimaryKeySelective(promotional record);

    int updateByPrimaryKey(promotional record);
}