package com.xiao.mapper;

import com.xiao.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

// Mapper表示这是一个mybatis的mapper类：Dao
@Mapper
@Repository
public interface UserMapper {

    List<User> queryUserList();

    User queryUserListById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    public User queryByName(String name);
}
