package com.study.demo.controller;

import com.study.demo.model.UserDomain;
import com.study.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(UserDomain user){
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("/all")
    public  Object findAllUser(
            @RequestParam(name = "pageNum",required = false,defaultValue = "1") int pageNum,
            @RequestParam(name = "pageSize",required = false,defaultValue = "10") int pageSize) {
        return userService.findAllUser(pageNum, pageSize);

    }

    @ResponseBody
    @GetMapping("/get")
    public  Object findByUserName(
            @RequestParam(value = "userName",required = true,defaultValue = "") String userName) {
        return userService.findByUserName(userName);

    }
}
