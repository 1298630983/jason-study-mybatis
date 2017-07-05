package com.jason.study.service;

import com.jason.study.entity.User;

public interface IUserService {
    //查询
    public User findUserById(int id);

    //添加
    public void addUser(User user);
}
