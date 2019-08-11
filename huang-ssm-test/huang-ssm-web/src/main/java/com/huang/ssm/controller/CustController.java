package com.huang.ssm.controller;

import com.huang.ssm.pojo.Cust;
import com.huang.ssm.pojo.User;
import com.huang.ssm.result.Result;
import com.huang.ssm.service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * create by Mr.huang
 * 666
 * 666
 */
@RestController
@RequestMapping("/cust")
public class CustController {
    @Autowired
    private CustService custervice;
    @RequestMapping("/findList")
    public Result findList(@RequestBody Cust cust) {
        try {
            List<Cust> list =  custervice.findList(cust);
            if(list!=null && list.size()>0){
                return new Result(true,"查询成功",list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"查询失败");
    }
    @RequestMapping("/del")
    public Result del(@RequestBody Cust cust){
        try {
            int i = custervice.del(cust);
            if(i>0){
                return new Result(true,"删除成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"删除失败");
    }
    @RequestMapping("/searchTypes")
    public Result searchTypes(){
        List<User> list = custervice.searchTypes();
        return new Result(true,"",list);
    }

    @RequestMapping("/add")
    public Result add(@RequestBody Cust cust){
        try {
            int i = custervice.add(cust);
            if(i>0){
                return new Result(true,"添加成功");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"添加失败");
    }
}
