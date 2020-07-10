package com.xiao.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xiao.pojo.User;
import com.xiao.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody  //不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        // jackson ,ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        // 创建一个对象
        User user = new User("可归1", 22, "男");
        String s = mapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping("/j2")
    @ResponseBody
    public String json2() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();
        User user1 = new User("可归", 22, "男");
        User user2 = new User("5+", 33, "女");
        User user3 = new User("5+可归", 55, "男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        return JsonUtils.getJson(userList);
    }

    @RequestMapping("/j3")
    @ResponseBody  //不会走视图解析器，会直接返回一个字符串
    public String json3() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date);
    }

    @RequestMapping("/j4")
    @ResponseBody  //不会走视图解析器，会直接返回一个字符串
    public String json4() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();
        User user1 = new User("可归", 22, "男");
        User user2 = new User("5+", 33, "女");
        User user3 = new User("5+可归", 55, "男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        String string = JSON.toJSONString(userList);
        return string;
    }
}
