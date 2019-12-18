package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by asvs on 2019/11/1.
 */
public class Teacher implements Serializable {
    private String id;//教室id
    private String name;//教师名字
    private String department;//大学院系
    private String job;//课程

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Teacher(String id, String name, String department, String job) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.job = job;
    }

    public Teacher() {
        super();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
