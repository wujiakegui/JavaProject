package com.xiao.springboot_learn.controller;

import com.xiao.springboot_learn.dao.EmployeeDao;
import com.xiao.springboot_learn.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Collection;

@Controller
public class EmployeeController {
    @Resource
    EmployeeDao employeeDao;

    @RequestMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage() {
        return "emp/add";
    }
}
