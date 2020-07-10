package com.xiao.mapper;


import com.xiao.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();

    // 添加一个用户
    public SqlSession addUser(User user);

    // 删除一个用户
    public int deleteUser(int id);
}
