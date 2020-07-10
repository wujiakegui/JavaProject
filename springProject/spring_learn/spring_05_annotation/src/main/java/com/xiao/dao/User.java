package com.xiao.dao;

import org.springframework.stereotype.Component;

// 等价于 <bean id="user" class="com.xiao.dao.User"/>
@Component
public class User {
    public String name = "可归";
}
