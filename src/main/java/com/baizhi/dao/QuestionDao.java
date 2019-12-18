package com.baizhi.dao;

import com.baizhi.entity.Question;

import java.util.List;

/**
 * Created by asvs on 2019/11/3.
 */
public interface QuestionDao {
    List<Question> queryAll();//查询所有

    void insert(Question question);//插入
}
