package com.xiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest1 {
    // 设置访问路径
    @RequestMapping("/t2")
    public String index(Model model) {
        // Spring MVC会自动实例化一个model对象用于向视图里传值
        model.addAttribute("msg", "ControllerTest1");
        return "test";
    }
}
