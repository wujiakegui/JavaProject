
import com.xiao.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 对象都在spring中管理，要是用，直接去里面取就可以了
//        Hello hello =(Hello) context.getBean("hello");
        Hello hello = context.getBean("hello", Hello.class);
        System.out.println(hello.toString());
    }
}
