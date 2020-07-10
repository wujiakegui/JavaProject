package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.TestDao;

public class Test {
    public static void main(String[] args) {
        //��ʼ��Spring����ApplicationContext�����������ļ�
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ͨ��������ȡtestʵ��
        TestDao tt = (TestDao) appCon.getBean("test");
        tt.sayHello();
    }
}
