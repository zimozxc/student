package com.baizhi.service;

import com.baizhi.dao.TeacherDao;
import com.baizhi.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by asvs on 2019/11/3.
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;

    public void setTeacherDao(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public List<Teacher> showAll() {
        return teacherDao.queryAll();
    }
}
