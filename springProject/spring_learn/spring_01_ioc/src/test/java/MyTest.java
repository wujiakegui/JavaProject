import com.xiao.dao.UserDaoMysql;
import com.xiao.dao.UserDaoOracle;
import com.xiao.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        // 用户实际调用的是业务层，dao层他们不需要解除
        UserServiceImpl userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoMysql());
        userService.setUserDao(new UserDaoOracle());
        userService.getUser();
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        UserServiceImpl userServiceImpl =(UserServiceImpl) context.getBean("UserServiceImpl");
//        userServiceImpl.getUser();
    }
}
