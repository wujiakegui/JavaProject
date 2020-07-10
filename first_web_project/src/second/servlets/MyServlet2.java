package second.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class MyServlet2 extends GenericServlet {
    // 省略四个方法   继承  进行使用即可
    // 与协议无关
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // 基于web项目有HTTP协议！该方法无法满足项目需求
        System.out.println("我是一个没有感情的杀手：提供服务！");
    }
}
