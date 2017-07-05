package com.jason.study.dao;


import com.jason.study.entity.User;

public interface IUserDao {
    //查询
    public User findUserById(int id);

    //添加
    public void addUser(User user);

}
