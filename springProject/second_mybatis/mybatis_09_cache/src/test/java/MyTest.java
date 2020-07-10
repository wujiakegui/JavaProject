import com.xiao.dao.UserMapper;
import com.xiao.pojo.User;
import com.xiao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {


    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(111);
        System.out.println(user);
        System.out.println("+++++++++++");
        User user1 = mapper.queryUserById(111);
        System.out.println(user1);
        System.out.println(user == user1);
        sqlSession.close();
    }

}
