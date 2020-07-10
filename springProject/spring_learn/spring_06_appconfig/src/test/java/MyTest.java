import com.xiao.config.XiaoConfig;
import com.xiao.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.AnnotatedElement;

public class MyTest {
    public static void main(String[] args) {
        // 完全使用配置类方式去做，通过AnnotationConfig 上下文来获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(XiaoConfig.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
