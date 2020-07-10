package aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * �����࣬�ڴ����б�д��������֪ͨ
 */
@Aspect//��Ӧ<aop:aspect ref="myAspect">
@Component//��Ӧ<bean id="myAspect" class="aspectj.xml.MyAspect"/>
public class MyAspect {
    /**
     * ���������
     */
    @Pointcut("execution(* dynamic.jdk.*.*(..))")
    private void myPointCut() {
        //��Ӧ<aop:pointcut expression="execution(* dynamic.jdk.*.*(..))" id="myPointCut"/>
    }

    /**
     * ǰ��֪ͨ��ʹ��Joinpoint�ӿ���Ϊ�������Ŀ�������Ϣ
     */
    @Before("myPointCut()")//��Ӧ<aop:before method="before" pointcut-ref="myPointCut"/>
    public void before(JoinPoint jp) {
        System.out.print("ǰ��֪ͨ��ģ��Ȩ�޿���");
        System.out.println("��Ŀ�������" + jp.getTarget()
                + "������ǿ����ķ�����" + jp.getSignature().getName());
    }

    /**
     * ���÷���֪ͨ
     */
    @AfterReturning("myPointCut()")
    public void afterReturning(JoinPoint jp) {
        System.out.print("���÷���֪ͨ��" + "ģ��ɾ����ʱ�ļ�");
        System.out.println("������ǿ����ķ�����" + jp.getSignature().getName());
    }

    /**
     * ����֪ͨ
     * ProceedingJoinPoint��JoinPoint�ӽӿڣ��������ִ�е�Ŀ�귽��
     * ����ֵ���ͱ�����Object
     * ����һ��������ProceedingJoinPoint����
     * ����throws Throwable
     */
    @Around("myPointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        //��ʼ
        System.out.println("���ƿ�ʼ��ִ��Ŀ�귽��ǰ��ģ�⿪������");
        //ִ�е�ǰĿ�귽��
        Object obj = pjp.proceed();
        //����
        System.out.println("���ƽ�����ִ��Ŀ�귽����ģ��ر�����");
        return obj;
    }

    /**
     * �쳣֪ͨ
     */
    @AfterThrowing(value = "myPointCut()", throwing = "e")
    public void except(Throwable e) {
        System.out.println("�쳣֪ͨ��" + "����ִ���쳣" + e.getMessage());
    }

    /**
     * ���ã����գ�֪ͨ
     */
    @After("myPointCut()")
    public void after() {
        System.out.println("����֪ͨ��ģ���ͷ���Դ");
    }

}
