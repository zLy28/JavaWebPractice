package com.zLy.dao;

import com.zLy.pojo.User;

public interface UserDao {

    public User checkUserName(String username);

    public int saveNewUser(User user);

    public User checkUsernameAndPassword(String username, String password);
}
