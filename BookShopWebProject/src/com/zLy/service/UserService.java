package com.zLy.service;

import com.zLy.pojo.User;

public interface UserService {

    public void registerUser(User user);

    public User login(User user);

    /**
     * Check whether the username has existed
     * @param username
     * @return Return ture if the username has already existed. Return false when the username is valid.
     */
    public boolean CheckUserExistence(String username);
}
