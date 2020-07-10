package com.xiao.dao;

import com.xiao.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {


    // 根据id查询用户
    User getUserById(int id);

    // 分页查询1
    List<User> getUserByLimit(Map<String, Integer> map);

    // 分页查询 RowBounds
    List<User> getUserByRowBounds();

}
