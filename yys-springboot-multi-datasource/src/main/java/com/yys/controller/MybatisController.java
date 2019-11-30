package com.yys.controller;

import com.yys.order.OrderMapper;
import com.yys.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 多数据源测试
 *      Controller
 * @author yys
 */
@RestController
@RequestMapping("/add")
public class MybatisController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 新增用户
     * @return
     */
    @RequestMapping("/user")
    public String addUser(String name, Integer age) {
        return userMapper.addUser(name, age) > 0 ? "addUser success" : "addUser fail";
    }

    /**
     * 新增订单
     * @return
     */
    @RequestMapping("/order")
    public String addOrder(Double amount, String address) {
        return orderMapper.addOrder(amount, address) > 0 ? "addOrder success" : "addOrder fail";
    }

}
