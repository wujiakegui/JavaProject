package com.xiao.dao;


import com.xiao.pojo.User;
import com.xiao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    // 查询所有
    @Test
    public void test() {
        // 第一步：获得SQLSession对象、
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行SQL
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        // 遍历userList
        for (User user : userList) {
            System.out.println(user);
        }
        // 关闭SQLSession
        sqlSession.close();
    }
}

