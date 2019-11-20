package com.yys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * 用户管理
 *      Service
 * @author yys
 */
@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean addUser(String userName, Integer age) {
        return jdbcTemplate.update("insert into yys_user values(null, ?, ?, 1, now(), now());", userName, age) > 0 ? true : false;
    }

}
