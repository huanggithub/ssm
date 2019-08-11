package com.huang.ssm.dao;

import com.huang.ssm.pojo.Cust;

import java.util.List;

/**
 * create by Mr.huang
 * 666
 * 666
 */
public interface CustDao {
    List<Cust> findList(Cust cust);
    int del(Cust cust);
    int add(Cust cust);
}
