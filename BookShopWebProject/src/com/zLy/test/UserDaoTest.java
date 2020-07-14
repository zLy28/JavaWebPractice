package com.zLy.test;

import com.zLy.dao.UserDao;
import com.zLy.dao.impl.UserDaoImpl;
import com.zLy.pojo.User;
import org.junit.Test;


public class UserDaoTest {

    @Test
    public void checkUserName() {
        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao.checkUserName("admin"));
    }

    @Test
    public void saveNewUser() {
        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao.saveNewUser(new User("zly", "123", "zly@gmail.com")));
    }

    @Test
    public void checkUsernameAndPassword() {
        UserDao userDao = new UserDaoImpl();
        System.out.println(userDao.checkUsernameAndPassword("admin","admin123"));
    }
}