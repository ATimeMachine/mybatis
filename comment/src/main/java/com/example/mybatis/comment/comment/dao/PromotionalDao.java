package com.example.mybatis.comment.comment.dao;

import com.example.mybatis.comment.comment.pojo.Promotional;

public interface PromotionalDao {
    int deleteByPrimaryKey(Integer promId);

    int insert(Promotional record);

    int insertSelective(Promotional record);

    Promotional selectByPrimaryKey(Integer promId);

    int updateByPrimaryKeySelective(Promotional record);

    int updateByPrimaryKey(Promotional record);
}