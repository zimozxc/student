package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by asvs on 2019/11/1.
 */
public interface UserDao {
    User queryByNameAndPassword(@Param("username") String username, @Param("password") String password);//根据密码和用户名查询有无此对象
}
