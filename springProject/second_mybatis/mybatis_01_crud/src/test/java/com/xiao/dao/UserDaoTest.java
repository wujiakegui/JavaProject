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
    public void getUserList() {
        // 第一步：获得SQLSession对象
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

    // 根据id查询
    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.getUserById(111);    // 自己表中的id不是1  而是111 细节害死人啊
        System.out.println(user);
        sqlSession.close();
    }

    // 添加    增删改需要提交事务
    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        int res = mapper.addUser(new User(666, "东", "666"));

        // 提交事务   重要
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        mapper.updateUser(new User(333, "华", "333"));
        // 提交事务   重要
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);

        mapper.deleteUser(666);
        // 提交事务   重要
        sqlSession.commit();

        sqlSession.close();
    }

    // 使用map添加数据
    @Test
    public void addUser2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", 777);
        map.put("name", "冉");
        map.put("pwd", "777");
        mapper.addUser2(map);
        // 提交事务   重要
        sqlSession.commit();
        sqlSession.close();
    }

    // 模糊查询
    @Test
    public void getUserLike() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserLike("黄%");
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}

