package com.xiao.dao;


import com.xiao.pojo.User;
import com.xiao.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {

    static Logger Logger = org.apache.log4j.Logger.getLogger(UserDaoTest.class);

    // 查询所有
    @Test
    public void test() {
        // 第一步：获得SQLSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行SQL
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getUserById(333);
        System.out.println(user);
        // 关闭SQLSession
        sqlSession.close();
    }

    @Test
    public void testLog4j() {
        Logger.info("info:进入了testLog4j");
        Logger.debug("debug:进入了testLog4j");
        Logger.error("error:进入了testLog4j");
    }

    // 分页查询 limit
    @Test
    public void getUserByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex", 0);
        map.put("pageSize", 4);

        List<User> userByLimit = mapper.getUserByLimit(map);
        for (User user : userByLimit) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    // 分页查询 RowBounds
    @Test
    public void getUserByRowBounds() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // RowBounds 实现
        RowBounds rowBounds = new RowBounds(1, 4);
        // 通过java代码层实现分页
        List<User> userList = sqlSession.selectList("com.xiao.dao.UserDao.getUserByRowBounds", null, rowBounds);

        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}

