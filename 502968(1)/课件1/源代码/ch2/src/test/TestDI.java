package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TestDIService;

public class TestDI {
    public static void main(String[] args) {
        //��ʼ��Spring����ApplicationContext�����������ļ�
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ͨ��������ȡtestDIServiceʵ�������Թ��췽�� ע��
        TestDIService ts = (TestDIService) appCon.getBean("testDIService");
        ts.sayHello();
        //ͨ��������ȡtestDIServiceʵ��������setter����ע�� 
        TestDIService ts1 = (TestDIService) appCon.getBean("testDIService1");
        ts1.sayHello();
    }
}
