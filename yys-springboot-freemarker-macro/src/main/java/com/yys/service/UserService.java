package com.yys.service;

import com.yys.entity.UserEntity;
import com.yys.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理
 *      Service
 * @author yys
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public boolean addUser(String userName, Integer age) {
        return userMapper.insert(userName, age) > 0 ? true : false;
    }

    public UserEntity getUserByName(String userName) {
        return userMapper.findByName(userName);
    }

    public List<UserEntity> getUserList() {
        return userMapper.findAll();
    }

}
