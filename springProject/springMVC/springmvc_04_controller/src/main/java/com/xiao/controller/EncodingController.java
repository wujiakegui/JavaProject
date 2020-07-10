package com.xiao.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EncodingController {
    @PostMapping("/e/t1")
    public String test1(String name, Model model) {
        model.addAttribute("msg", name);
        return "test";
    }
}
