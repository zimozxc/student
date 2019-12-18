package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by asvs on 2019/11/1.
 */
@Service
public class UserServiceImpl implements UserService {
    //用户登录
    @Autowired
    private UserDao userDao;

   /* public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public User login(String username, String password) {
        System.out.println();
        return userDao.queryByNameAndPassword(username, password);
    }
}
