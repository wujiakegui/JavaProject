package com.xiao.config;

import com.xiao.pojo.User;
import com.xiao.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm  extends AuthorizingRealm {
    @Autowired
    UserService userService;
    // 授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了——授权doGetAuthorizationInfo");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermission("user:add");
        return info;
    }
    // 认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//        System.out.println("执行了——认证doGetAuthenticationInfo");
        // 用户名，密码  数据库中取
        UsernamePasswordToken userToken = (UsernamePasswordToken) token;
        // 连接真实的数据库
        User user = userService.queryByName(userToken.getUsername());
        if(user==null){
            return null;   // 抛出异常
        }
        // 密码认证，shiro做
        return new SimpleAuthenticationInfo("",user.getPwd(),"");
    }
}
