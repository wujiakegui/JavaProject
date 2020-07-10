package xiao.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import xiao.utils.MybatisUtils;
import xiao.pojo.User;
import xiao.utils.MybatisUtils;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 底层主要应用反射
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> users = mapper.getUser();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 底层主要应用反射
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User userById = mapper.getUserById(333);
        System.out.println(userById);
        sqlSession.close();
    }

    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 底层主要应用反射
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.addUser(new User(999, "kegui", "999"));
        mapper.addUser(new User(777, "吴佳", "777"));
        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 底层主要应用反射
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.updateUser(new User(999, "wujiakegui", "123456789"));
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 底层主要应用反射
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.deleteUser(999);
        sqlSession.close();
    }
}
