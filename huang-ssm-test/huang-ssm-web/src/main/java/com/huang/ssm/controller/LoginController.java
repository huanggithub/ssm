package com.huang.ssm.controller;

import com.huang.ssm.pojo.User;
import com.huang.ssm.result.Result;
import com.huang.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * create by Mr.huang
 * 666
 * 666
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/loginIn")
    public Result login(@RequestBody User user){
        try {
            User user1 = loginService.login(user);
            if(user1!=null){
                return new Result(true,"登录成功",user1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"登录失败，用户名或者密码错误");
    }

}
