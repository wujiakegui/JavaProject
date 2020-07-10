package com.xiao.blog.service;

import com.xiao.blog.pojo.User;

public interface UserService {

    User checkUser(String username, String password);
}

