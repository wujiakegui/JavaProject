package com.xiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/HelloController")
public class HelloController {
    //真实访问地址 : 项目名/HelloController/hello
    @RequestMapping("/h1")
    public String hello(Model model) {
        // 封装数据
        model.addAttribute("msg", "HelloSrpingMVCAnnotation笑");
        return "hello";  // 会被视图解析器处理//web-inf/jsp/hello.jsp
    }
}
