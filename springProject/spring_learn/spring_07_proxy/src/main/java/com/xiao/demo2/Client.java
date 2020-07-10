package com.xiao.demo2;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();
        // 代理角色：现在没有，使用代理类
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 通过调用程序处理角色来处理我们需要调用的接口对象
        pih.setRent(host);
        // 这里的proxy就是动态生成的
        Rent proxy = (Rent) pih.getProxy();
        proxy.rent();
    }
}
