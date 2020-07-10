package com.xiao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class Forward_Redirect {
    @RequestMapping("/x1")
    public String test1(Model model) {
        model.addAttribute("msg", "可归");
        return "/WEB-INF/jsp/test.jsp";
    }

    @RequestMapping("/x2")
    public String test2(Model model) {
        model.addAttribute("msg", "可归");
        return "redirect:index.jsp";
    }

    @RequestMapping("/x3")
    public String test3(Model model) {
        model.addAttribute("msg", "可归");
        return "test";
    }

    @RequestMapping("/x4")
    public String test4(Model model) {
        model.addAttribute("msg", "可归");
        return "redirect:/index.jsp";
    }
}
