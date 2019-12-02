package com.yys.order.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * 订单管理
 *      Mapper
 * @author yys
 */
public interface OrderMapper {

    @Insert("INSERT INTO `order` VALUES (NULL, #{amount}, #{address}, 1, NOW(), NOW())")
    int addOrder(@Param("amount") Double amount, @Param("address") String address);

}
