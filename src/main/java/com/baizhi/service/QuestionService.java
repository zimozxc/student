package com.baizhi.service;

import com.baizhi.entity.Question;

import java.util.List;

/**
 * Created by asvs on 2019/11/3.
 */
public interface QuestionService {
    List<Question> showAll();//展示所有

    void add(Question question);//插入问题
}
