package com.yys.controller;

import com.yys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 *      Controller
 * @author yys
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public String addUser(String userName, Integer age) {
        return userService.addUser(userName, age) ? "success" : "fail";
    }

}
