package com.xiao.controller;

import com.xiao.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello swagger";
    }
    // 只要接口中，返回值中存在实体类，他就会被扫描到swagger中
    @PostMapping(value="/user")
    public User user(){
        return new User();
    }
}
