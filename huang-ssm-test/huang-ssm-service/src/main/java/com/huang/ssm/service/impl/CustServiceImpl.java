package com.huang.ssm.service.impl;

import com.huang.ssm.dao.CustDao;
import com.huang.ssm.dao.UserDao;
import com.huang.ssm.pojo.Cust;
import com.huang.ssm.pojo.User;
import com.huang.ssm.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create by Mr.huang
 * 666
 * 666
 */
@Service
public class CustServiceImpl implements CustService {
    @Autowired
    private CustDao custDao;
    @Autowired
    private UserDao userDao;
    @Override
    public List<Cust> findList(Cust cust) {
        List<Cust> list = custDao.findList(cust);
        for (Cust cust1 : list) {
            int id = cust1.getCust_link_user();
            User byId = userDao.findById(id);
            cust1.setUser(byId);
        }
        return list;
    }

    @Override
    public int del(Cust cust) {
        return custDao.del(cust);
//        return 0;
    }

    @Override
    public List<User> searchTypes() {
        List<User> list = userDao.searchTypes();
        return list;
    }

    @Override
    public int add(Cust cust) {
        int add = custDao.add(cust);
        return add;
    }
}
