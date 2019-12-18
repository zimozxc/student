package com.baizhi.action;

import com.baizhi.entity.Teacher;
import com.baizhi.service.TeacherService;
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
public class TeacherAction extends ActionSupport {
    @Autowired
    private TeacherService teacherService;

    /*public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }*/
    private List<Teacher> list;

    public List<Teacher> getList() {
        return list;
    }

    public void setList(List<Teacher> list) {
        this.list = list;
    }

    public String showAll() {
        list = teacherService.showAll();
        return "showAll";
    }
}
