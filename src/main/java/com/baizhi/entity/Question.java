package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by asvs on 2019/11/3.
 */
public class Question implements Serializable {
    private String id;
    private String title;
    private String tname;
    private String sname;
    private Date time;
    private String context;
    private String hf;
    private String state;

    @Override
    public String toString() {
        return "Question{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", tname='" + tname + '\'' +
                ", sname='" + sname + '\'' +
                ", time=" + time +
                ", context='" + context + '\'' +
                ", hf='" + hf + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public Question() {
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getHf() {
        return hf;
    }

    public void setHf(String hf) {
        this.hf = hf;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
