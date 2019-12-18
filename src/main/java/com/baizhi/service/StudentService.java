package com.baizhi.service;

import com.baizhi.entity.Student;

import java.util.List;

/**
 * Created by asvs on 2019/11/3.
 */
public interface StudentService {
    List<Student> showAll();//展示所有

    List<Student> showLikeByClazzOrName(String key, String name);//根据名字或者班级模糊查询

    void addStudent(Student student);//插入学生

    void update(String name, String mobile, String clazz, String id);//修改学生数据

    void delete(String id);//根据id删除学生
}
