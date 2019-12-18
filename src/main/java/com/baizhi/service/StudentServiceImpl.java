package com.baizhi.service;

import com.baizhi.dao.StudentDao;
import com.baizhi.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by asvs on 2019/11/3.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    /*public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }*/
    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.DEFAULT)
    public List<Student> showAll() {
        return studentDao.queryAll();
    }

    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.DEFAULT)
    public List<Student> showLikeByClazzOrName(String key, String name) {
        return studentDao.queryLikeByClazzOrName(key, name);
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
    public void addStudent(Student student) {
        studentDao.insert(student);
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
    public void update(String name, String mobile, String clazz, String id) {
        studentDao.update(name, mobile, clazz, id);
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
    public void delete(String id) {
        studentDao.delete(id);
    }
}
