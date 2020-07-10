package dynamic.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import aspect.MyAspect;

public class CglibDynamicProxy implements MethodInterceptor {
    /**
     * ��������ķ���������CGLIB�������
     * targetĿ�������Ҫ��ǿ�Ķ���
     * ����Ŀ������CGLIB�������
     */
    public Object createProxy(Object target) {
        //����һ����̬����󣬼���ǿ�����
        Enhancer enhancer = new Enhancer();
        //ȷ����Ҫ��ǿ���࣬�����丸��
        enhancer.setSuperclass(target.getClass());
        //ȷ�������߼�����Ϊ��ǰ����Ҫ��ǰ����ʵ��MethodInterceptor�ķ���
        enhancer.setCallback(this);
        //���ش����Ĵ������
        return enhancer.create();
    }

    /**
     * intercept�������ڳ���ִ��Ŀ�귽��ʱ������
     * proxy CGLIB����ָ���������ɵĴ������
     * method���ط���
     * args���ط����Ĳ�������
     * methodProxy�����Ĵ����������ִ�и���ķ���
     * ���ش�����
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //����һ������
        MyAspect myAspect = new MyAspect();
        //ǰ��ǿ
        myAspect.check();
        myAspect.except();
        //Ŀ�귽��ִ�У����ش�����
        Object obj = methodProxy.invokeSuper(proxy, args);
        //����ǿ
        myAspect.log();
        myAspect.monitor();
        return obj;
    }

}
