package com.jason.study.service;

import com.jason.study.dao.IUserDao;
import com.jason.study.dao.UserDaoImpl;
import com.jason.study.entity.User;

public class UserServiceImpl implements IUserService {
    private IUserDao userDao;

    public UserServiceImpl(){
        userDao = new UserDaoImpl();
    }

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }
}
