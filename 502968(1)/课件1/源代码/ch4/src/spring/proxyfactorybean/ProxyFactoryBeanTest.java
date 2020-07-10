package spring.proxyfactorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import dynamic.jdk.TestDao;

public class ProxyFactoryBeanTest {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("/spring/proxyfactorybean/applicationContext.xml");
        //�������У���ȡ��ǿ���Ŀ�����
        TestDao testDaoAdvice = (TestDao) appCon.getBean("testDaoProxy");
        //ִ�з���
        testDaoAdvice.save();
        System.out.println("================");
        testDaoAdvice.modify();
        System.out.println("================");
        testDaoAdvice.delete();
    }
}
