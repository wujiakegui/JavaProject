package dynamic.cglib;

public class CglibDynamicTest {
    public static void main(String[] args) {
        //�����������
        CglibDynamicProxy cdp = new CglibDynamicProxy();
        //����Ŀ�����
        TestDao testDao = new TestDao();
        //��ȡ��ǿ���Ŀ�����
        TestDao testDaoAdvice = (TestDao) cdp.createProxy(testDao);
        //ִ�з���
        testDaoAdvice.save();
        System.out.println("==============");
        testDaoAdvice.modify();
        System.out.println("==============");
        testDaoAdvice.delete();
    }
}
