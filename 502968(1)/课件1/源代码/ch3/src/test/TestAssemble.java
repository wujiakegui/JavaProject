package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import assemble.ComplexUser;

public class TestAssemble {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        //���췽��װ�����
        ComplexUser u1 = (ComplexUser) appCon.getBean("user1");
        System.out.println(u1);
        //setter����װ�����
        ComplexUser u2 = (ComplexUser) appCon.getBean("user2");
        System.out.println(u2);
    }
}
