package com.xiao.service;

import com.xiao.mapper.UserMapper;
import com.xiao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public User queryByName(String name) {
        return userMapper.queryByName(name);
    }
}
