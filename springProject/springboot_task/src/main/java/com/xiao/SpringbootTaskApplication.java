package com.xiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling   // 开启定时功能的注解
@EnableAsync   // 开启异步注解
@SpringBootApplication
public class SpringbootTaskApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootTaskApplication.class, args);
    }
}
