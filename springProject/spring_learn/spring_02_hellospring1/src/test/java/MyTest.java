import com.xiao.dao.TestDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

    }

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TestDao hello = context.getBean("hello", TestDao.class);
        hello.sayHello();
    }
}
