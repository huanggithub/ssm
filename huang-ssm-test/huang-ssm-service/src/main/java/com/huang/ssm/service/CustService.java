package com.huang.ssm.service;

import com.huang.ssm.pojo.Cust;
import com.huang.ssm.pojo.User;

import java.util.List;

/**
 * create by Mr.huang
 * 666
 * 666
 */
public interface CustService {
    List<Cust> findList(Cust cust);

    int del(Cust cust);

    List<User> searchTypes();

    int add(Cust cust);
}
