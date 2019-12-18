package com.baizhi.entity;

import java.io.Serializable;

/**
 * Created by asvs on 2019/11/1.
 */
public class Student implements Serializable {
    private String id;
    private String name;
    private String sex;
    private String mobile;
    private String clazz;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

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

    public Student() {
        super();
    }

    public Student(String id, String name, String sex, String mobile, String clazz) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.mobile = mobile;
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", mobile='" + mobile + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }
}
