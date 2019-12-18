package com.baizhi.dao;

import com.baizhi.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by asvs on 2019/11/1.
 */
public interface StudentDao {
    List<Student> queryAll();//展示所有

    List<Student> queryLikeByClazzOrName(@Param("key") String key, @Param("name") String name);//根据名字或者班级模糊查询

    void insert(Student student);//插入学生

    void update(@Param("name") String name, @Param("mobile") String mobile, @Param("clazz") String clazz, @Param("id") String id);//修改学生数据

    void delete(String id);//根据id删除学生
}
