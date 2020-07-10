package com.xiao.controller;

import com.xiao.mapper.UserMapper;
import com.xiao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUserList")
    public List<User> queryUserList() {
        List<User> userList = userMapper.queryUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        return userList;
    }

    @GetMapping("/addUser1")
    public String addUser(){
        userMapper.addUser(new User(999,"wujia", "999"));
        return "ok";
    }

    @GetMapping("/updateUser1")
    public String updateUser(){
        userMapper.updateUser(new User(999,"kegui","666"));
        return "ok";
    }

    @GetMapping("/deleteUser1")
    public String deleteUser(){
        userMapper.deleteUser(999);
        return "ok";
    }

}
