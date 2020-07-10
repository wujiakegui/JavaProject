import com.xiao.pojo.Instantiation_1_NoParaStructure;
import com.xiao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test1() {
        //1.获取spring文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //2.由配置文件返回对象
        Instantiation_1_NoParaStructure b = context.getBean("bean1", Instantiation_1_NoParaStructure.class);
        System.out.println(b);
        b.show();
    }

    @Test
    public void test2() {
        // Spring容器，类似于婚介网站
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.show();
    }
}
