package com.baizhi.action;

import com.baizhi.entity.Student;
import com.baizhi.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by asvs on 2019/11/3.
 */
@Controller
@Scope(value = "prototype")
public class StudentAction extends ActionSupport {
    @Autowired
    private StudentService studentService;

    /* public void setStudentService(StudentService studentService) {
         this.studentService = studentService;
     }*/
    private List<Student> list;
    private Student student;
    private String id;
    private String key;
    private String name;
    private String mobile;
    private String clazz;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String showAll() {
        List<Student> list = studentService.showAll();
        ServletActionContext.getContext().getSession().put("student", list);
        System.out.println(list + "===null");
        return "showAll";
    }

    public String showLike() {
        List<Student> list = studentService.showLikeByClazzOrName(key, name);
        List<Student> list2 = (List<Student>) ServletActionContext.getContext().getSession().get("student");
        ServletActionContext.getContext().getSession().put("student", list);
        return "showLike";
    }

    public String add() {
        studentService.addStudent(student);
        return "add";
    }

    public String update() {
        studentService.update(name, mobile, clazz, id);
        return "update";
    }

    public String delete() {
        studentService.delete(id);
        return "delete";
    }
}
