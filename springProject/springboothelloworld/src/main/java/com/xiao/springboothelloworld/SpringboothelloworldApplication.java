package com.xiao.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 注解@SpringBootApplication ： 标注这个类是一个springboot的应用
@SpringBootApplication
public class SpringboothelloworldApplication {
    public static void main(String[] args) {
        // 将springboot应用启动
        SpringApplication.run(SpringboothelloworldApplication.class, args);
    }
}
