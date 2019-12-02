package com.yys.order.service;

import com.yys.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单管理
 *      Service
 * @author yys
 */
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public String addOrder(Double amount, String address) {
        return orderMapper.addOrder(amount, address) > 0 ? "insert order success" : "insert order fail";
    }

}
