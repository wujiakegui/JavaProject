package xiao.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import xiao.pojo.Student;
import xiao.pojo.Teacher;
import xiao.utils.MybatisUtils;

import java.util.List;

public class MyTest {

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        for (Teacher teacher : sqlSession.getMapper(TeacherMapper.class).getTeacher()) {
            System.out.println(teacher);
        }
        sqlSession.close();
    }

    @Test
    public void test1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
