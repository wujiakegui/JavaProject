package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import life.BeanLife;

public class TestLife {
    public static void main(String[] args) {
        //��ʼ��Spring���������������ļ�
        //Ϊ�˷�����ʾ���ٷ�����ִ�У�����ʹ��ClassPathXmlApplicationContextʵ������������
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("��ö���ǰ");
        BeanLife blife = (BeanLife) ctx.getBean("beanLife");
        System.out.println("��ö����" + blife);
        ctx.close();//�ر�����������Bean����
    }
}
