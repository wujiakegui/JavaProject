package dynamic.jdk;

public class JDKDynamicTest {
    public static void main(String[] args) {
        //�����������
        JDKDynamicProxy jdkProxy = new JDKDynamicProxy();
        //����Ŀ�����
        TestDao testDao = new TestDaoImpl();
        //�Ӵ�������л�ȡ��ǿ���Ŀ����󣬸ö�����һ��������Ķ���������������߼�����invoke��
        TestDao testDaoAdvice = (TestDao) jdkProxy.createProxy(testDao);
        //ִ�з���
        testDaoAdvice.save();
        System.out.println("==============");
        testDaoAdvice.modify();
        System.out.println("==============");
        testDaoAdvice.delete();
    }
}
