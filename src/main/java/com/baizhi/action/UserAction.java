package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by asvs on 2019/11/1.
 */
@Controller
@Scope(value = "prototype")
public class UserAction extends ActionSupport {
    @Autowired
    private UserService userService;
    private String username;
    private String password;

   /* public UserService getUserService() {
        return userService;
    }*/

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //登录
    public String login() {
        System.out.println("service==" + userService);
        User user = userService.login(username, password);
        if (user.getLevels().equals("1")) {
            return "loginteacher";
        } else return "loginstudent";
    }
}
