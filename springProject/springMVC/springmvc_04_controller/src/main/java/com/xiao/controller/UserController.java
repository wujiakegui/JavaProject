package com.xiao.controller;

import com.xiao.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    // localhost:8080/user/t1?name=xxx'
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model) {
        // 1 接受前端参数
        System.out.println("接收前端的参数为:" + name);
        // 2 将返回的结果传递给前端
        model.addAttribute("msg", name);
        // 3 视图跳转
        return "test";
    }

    // 前端接受的是一个对象：id，name，age
    @GetMapping("t2")
    public String test2(User user) {
        System.out.println(user);
        return "test";
    }
}
