package second.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(value = "/m9")
public class LifeServlet implements Servlet {
    public LifeServlet() {
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化方法");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("配置信息方法");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("服务方法");
    }

    @Override
    public String getServletInfo() {
        System.out.println("基本信息方法");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("销毁方法");
    }
}
