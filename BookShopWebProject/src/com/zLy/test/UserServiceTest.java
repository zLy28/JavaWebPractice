package com.zLy.test;

import com.zLy.pojo.User;
import com.zLy.service.UserService;
import com.zLy.service.impl.UserServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {
    UserService userService = new UserServiceImpl();

    @Test
    public void registerUser() {
        userService.registerUser(new User("qwe","222","qwe@qq.com"));
    }

    @Test
    public void login() {
        System.out.println(userService.login(new User("zly","12","")));
    }

    @Test
    public void checkUserExistence() {
        System.out.println(userService.CheckUserExistence("zly"));
    }
}