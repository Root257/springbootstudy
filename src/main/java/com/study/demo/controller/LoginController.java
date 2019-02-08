package com.study.demo.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello...";
    }
    @GetMapping(value = "/index")
    public String index(){

        return  "index";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(String userName,String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName,password);
        subject.login(token);
        return "login";
    }
}
