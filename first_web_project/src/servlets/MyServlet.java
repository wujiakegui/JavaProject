package servlets;

//Servlet核心五个内容

import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import java.io.IOException;

public class MyServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        //初始化servlet
    }

    public ServletConfig getServletConfig() {
        //获得servlet配置信息
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("我是一个没有感情的杀手");
    }

    public String getServletInfo() {
        //获得servlet基本信息
        return null;
    }

    public void destroy() {
        //销毁servlet
    }
}

