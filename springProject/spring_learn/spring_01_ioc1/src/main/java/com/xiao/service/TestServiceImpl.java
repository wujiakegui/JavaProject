package com.xiao.service;

import com.xiao.dao.TestDao;

public class TestServiceImpl implements TestService {
    private TestDao testDao;

    // 构造方法，用于实现依赖注入接口对象TestDao
    public TestServiceImpl(TestDao testDao) {
        super();
        this.testDao = testDao;
    }

    public void sayHello() {
        // 调用testDao中的sayHello方法
        testDao.sayHello();
        System.out.println("TestService构造方法注入say：Hello ，IOC");
    }
}
