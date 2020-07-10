package com.xiao.blog.web;

import com.xiao.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }
    // 测试500 404 页面
//    @GetMapping("/")
//    public String indextest(){
//        String blog = null;
//        if(blog == null){
//            throw new NotFoundException("博客不存在");
//        }
//        return "index";
//    }
}
