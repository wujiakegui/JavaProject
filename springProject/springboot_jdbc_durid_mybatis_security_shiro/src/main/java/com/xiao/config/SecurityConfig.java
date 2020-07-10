package com.xiao.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    // 授权       链式编程
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 请求授权的规则
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/html1").hasRole("role1")
                .antMatchers("/html2").hasRole("role2")
                .antMatchers("/html4").hasRole("role3");
        // 没有权限默认会到登录页面，需要开启登录页面   定制登录页
        http.formLogin().loginPage("/toLogin");
        // 注销 开启注销，跳转首页
        http.logout().logoutSuccessUrl("/");
        // 开启记住我 cookie 默认保持两周 自定义接收前端的参数
        http.rememberMe().rememberMeParameter("remember");
    }
    // 认证       高版本密码需要加密，否则会报错
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("xiao").password(new BCryptPasswordEncoder().encode("123")).roles("role1","role2")
                .and()
                .withUser("kegui").password(new BCryptPasswordEncoder().encode("123")).roles("role1","role2","role3")
                .and()
                .withUser("wujia").password(new BCryptPasswordEncoder().encode("123")).roles("role1");
    }
}
