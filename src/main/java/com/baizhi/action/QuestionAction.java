package com.baizhi.action;

import com.baizhi.dao.QuestionDao;
import com.baizhi.entity.Question;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by asvs on 2019/11/3.
 */
@Controller
@Scope(value = "prototype")
public class QuestionAction extends ActionSupport {
    @Autowired
    private QuestionDao questionDao;
    private List<Question> list;
    private String context;
    private String textarea;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTextarea() {
        return textarea;
    }

    public void setTextarea(String textarea) {
        this.textarea = textarea;
    }

    public List<Question> getList() {
        return list;
    }

    public void setList(List<Question> list) {
        this.list = list;
    }

    public void setQuestionDao(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public String showAll() {
        list = questionDao.queryAll();
        return "showAll";
    }

    public String add() {
        return null;
    }
}
