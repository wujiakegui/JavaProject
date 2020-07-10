package com.xiao.springboothelloworld;

import com.xiao.springboothelloworld.pojo.Dog;
import com.xiao.springboothelloworld.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringboothelloworldApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired  // 将狗狗自动注入进来
            Dog dog;

    @Test
    public void test() {
        System.out.println(dog);
    }

    @Autowired
    private Person person;

    @Test
    public void test1() {
        System.out.println(person);
    }
}
