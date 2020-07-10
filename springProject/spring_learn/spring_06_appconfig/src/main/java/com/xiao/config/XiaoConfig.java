package com.xiao.config;

import com.xiao.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// @Configuration代表这是一个配置类==beans.xml
@Configuration
@ComponentScan("com.xiao.pojo")
@Import(XiaoConfig1.class)
public class XiaoConfig {
    // 注册一个bean，== bean标签
    // 这个方法的名字， == bean标签中的id属性
    // 这个方法的返回值， == bean标签中的class属性
    @Bean
    public User getUser() {
        return new User();
    }
}
