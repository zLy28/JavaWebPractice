package com.zLy.service.impl;

import com.zLy.dao.UserDao;
import com.zLy.dao.impl.UserDaoImpl;
import com.zLy.pojo.User;
import com.zLy.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registerUser(User user) {
        userDao.saveNewUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.checkUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @Override
    public boolean CheckUserExistence(String username) {
        if (userDao.checkUserName(username) == null) {
            return false;
        }
        return true;
    }
}
