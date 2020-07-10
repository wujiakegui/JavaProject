package com.xiao.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.apache.catalina.filters.FilterBase;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }

    // 后台监控
    // 因为springboot内置了servlet容器，所以没有web.xml,替代方法：ServletRegistrationBean
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean =new ServletRegistrationBean<>(new StatViewServlet(),"/druid/*");
    // 后台账号密码配置
        HashMap<String, String>  initParameters = new HashMap<>();
        // 增加配置
        initParameters.put("loginUsername","root");  // 登录的key是固定的 loginUsername loginPassword
        initParameters.put("loginPassword","xiao");
        // 允许谁能访问
        initParameters.put("allow","");
        // 禁止谁能访问
//        initParameters.put("用户名","ip地址");
        bean.setInitParameters(initParameters);   // 设置初始化参数
        return bean;
    }

    // filter
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        // 可以过来哪些请求
        Map<String,String> initParameters = new HashMap<>();
        // 不进行统计的
        initParameters.put("exclusions","*.js,*.css,/druid/*");
        bean.setInitParameters(initParameters);
        return bean;
    }
}
