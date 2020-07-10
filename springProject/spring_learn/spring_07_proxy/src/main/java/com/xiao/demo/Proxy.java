package com.xiao.demo;

public class Proxy {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    // 出租
    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    // 看房
    public void seeHouse() {
        System.out.println("中介可以带你去看房子");
    }

    // 收中介费
    public void fare() {
        System.out.println("收中介费");
    }

    // 签合同
    public void hetong() {
        System.out.println("签租赁合同");
    }
}
