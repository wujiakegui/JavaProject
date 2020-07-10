package service;

import dao.TestDIDao;

public class TestDIServiceImpl1 implements TestDIService {
    private TestDIDao testDIDao;

    //���testDIDao���Ե�setter����������ʵ������ע��
    public void setTestDIDao(TestDIDao testDIDao) {
        this.testDIDao = testDIDao;
    }

    @Override
    public void sayHello() {
        //����testDIDao�е�sayHello����
        testDIDao.sayHello();
        System.out.println("TestDIService setter����ע��  say: Hello, Study hard!");
    }

}
