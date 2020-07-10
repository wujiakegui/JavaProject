import com.xiao.service.TestService;
import com.xiao.service.TestServiceImpl;
import com.xiao.service.TestServiceImpl1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

    }

    @Test
    public void test() {
        // 初始化Spring容器，ApplicationContext，加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 通过容器获取testService实例，测试构造方法注入
        TestService testService = context.getBean("testService", TestServiceImpl.class);
        testService.sayHello();
    }

    @Test
    public void test1() {
        // 初始化Spring容器，ApplicationContext，加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 通过容器获取testService实例，测试构造方法注入
        TestService ts = context.getBean("testService1", TestServiceImpl1.class);
        ts.sayHello();
    }
}
