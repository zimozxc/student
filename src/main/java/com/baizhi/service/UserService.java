package com.baizhi.service;

import com.baizhi.entity.User;

/**
 * Created by asvs on 2019/11/1.
 */
public interface UserService {
    User login(String username, String password);//登录
}
