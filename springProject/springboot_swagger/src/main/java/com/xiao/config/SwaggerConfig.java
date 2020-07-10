package com.xiao.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2       // 开启Swagger2
public class SwaggerConfig {

    // 配置多个分组
    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("wujia");
    }
    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("wujiakegui");
    }

    // 配置Swagger的Docket的bean实例
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("kegui")
                .enable(true)     // 是否启用 Swagger 如果为false，则swagger不能再浏览器中访问
                .select()
                // RequestHandlerSelectors 配置要扫描接口的方式
                // basePackage: 指定要扫描的包
                .apis(RequestHandlerSelectors.basePackage("com.xiao.controller"))
//                .paths(PathSelectors.ant("/xiao/**"))                   // paths（） 过滤路径
                .build();
    }
    // 配置Swagger信息
    private ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("可归","wwww.baidu.com","xiao2769433@163.com");
        return new ApiInfo(
            "可归的文档",
            "我是一个没有感情的杀手",
            "v1.11",
            "www.baidu.com",
            contact,
            "Apache 2.0",
            "http://www.apache.org/licenses/LICENSE-2.0",
            new ArrayList()
        );
    }
}
