package com.baizhi.service;

import com.baizhi.dao.QuestionDao;
import com.baizhi.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by asvs on 2019/11/3.
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionDao questionDao;

    /* public void setQuestionDao(QuestionDao questionDao) {
         this.questionDao = questionDao;
     }
 */
    public List<Question> showAll() {
        return questionDao.queryAll();
    }

    public void add(Question question) {
        questionDao.insert(question);
    }
}
