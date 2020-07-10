package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import instance.BeanClass;

public class TestInstance {
    public static void main(String[] args) {
        //��ʼ��Spring����ApplicationContext�����������ļ�
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        //���Թ��췽��ʵ����Bean
        BeanClass b1 = (BeanClass) appCon.getBean("constructorInstance");
        System.out.println(b1);
        BeanClass b2 = (BeanClass) appCon.getBean("constructorInstance");
        System.out.println(b2);
    }
}
