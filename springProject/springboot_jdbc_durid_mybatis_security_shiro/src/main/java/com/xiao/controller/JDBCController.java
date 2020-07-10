package com.xiao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    // 查询数据库的所有信息
    // 没有实体类，数据库中的东西怎么获取  ----》   map
    @GetMapping("/userList")
    public List<Map<String,Object>> userList(){
        String sql = "select * from teacher";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }

    @GetMapping("/addUser")
    public String addUser(){
        String sql = "insert into xiao.teacher values(6,'笑')";
        jdbcTemplate.update(sql);
        return "update-ok";
    }

    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") int id){
        String sql = "update xiao.teacher set t_name=? where t_id=" +id;
        Object [] objects = new Object[1];
        objects[0]="可归";
        jdbcTemplate.update(sql,objects);
        return "update-ok";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id")int id){
        String sql = "delete from xiao.teacher where t_id =? ";
        jdbcTemplate.update(sql,id);
        return "update-ok";
    }
}
