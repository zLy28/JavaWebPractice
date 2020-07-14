package com.zLy.dao.impl;

import com.zLy.dao.UserDao;
import com.zLy.pojo.User;

public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public User checkUserName(String username) {
        String sql = "select `id`, `username`,`password`,`email` from user_of_bookshop where username =?";
        return queryReturnOneRow(User.class, sql, username);
    }

    @Override
    public int saveNewUser(User user) {
        String sql = "insert into user_of_bookshop(`username`,`password`,`email`) values (?,?,?)";
        return update(sql, user.getUsername(), user.getPassword(), user.getEmail());
    }

    @Override
    public User checkUsernameAndPassword(String username, String password) {
        String sql = "select `id`, `username`,`password`,`email` from user_of_bookshop where username =? and password =?";
        return queryReturnOneRow(User.class, sql, username,password);
    }
}
