package com.baizhi.test;

import com.baizhi.dao.UserDao;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asvs on 2019/11/3.
 */
public class test {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        System.out.println(userDao);
    }

}
