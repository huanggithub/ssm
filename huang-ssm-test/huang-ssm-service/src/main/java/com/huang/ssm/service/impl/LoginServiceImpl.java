package com.huang.ssm.service.impl;

import com.huang.ssm.dao.LoginDao;
import com.huang.ssm.pojo.User;
import com.huang.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * create by Mr.huang
 * 666
 * 666
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;
    @Override
    public User login(User user) {
        User login = loginDao.login(user);
        return login;
    }
}
