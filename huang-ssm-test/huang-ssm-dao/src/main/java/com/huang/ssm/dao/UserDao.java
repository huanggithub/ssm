package com.huang.ssm.dao;

import com.huang.ssm.pojo.User;

import java.util.List;

/**
 * create by Mr.huang
 * 666
 * 666
 */
public interface UserDao {
    User findById(int id);
    List<User> searchTypes();
}
