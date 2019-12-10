package com.yys.controller;

import com.yys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义指令(宏)
 *      Controller
 * @author yys
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String userList(HttpServletRequest request) {
        // 获取用户列表
        request.setAttribute("userList", userService.getUserList());
        return "user/list";
    }

}
