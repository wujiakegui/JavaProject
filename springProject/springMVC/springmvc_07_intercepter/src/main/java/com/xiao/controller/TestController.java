package com.xiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/t1")
    public String test() {
        System.out.println("鸿鹄之志，不屈之心");
        return "OK";
    }
}
//测试拦截器的控制器
//@Controller
//public class TestController {
//    @RequestMapping("/t2")
//    @ResponseBody
//    public String testFunction() {
//        System.out.println("鸿鹄之志，不屈之心");
//        return "hello";
//    }
//}