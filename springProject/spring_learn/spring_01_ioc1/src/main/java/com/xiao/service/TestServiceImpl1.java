package com.xiao.service;

import com.xiao.dao.TestDao;

public class TestServiceImpl1 implements TestService {

    private TestDao testDao;
    // 添加testDao属性的setter方法，用于实现依赖注入

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }

    public void sayHello() {
        // 调用testDao中的sayHello方法
        testDao.sayHello();
        System.out.println("TestService setter方法注入 say：Hello , IOC");
    }
}
