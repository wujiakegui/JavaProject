package com.po;

import java.util.List;

/**
 * springtest���ݿ���user��ĳ־û���
 */
public class MyUser {
    private Integer uid;//����
    private String uname;
    private String usex;
    //һ�Զ������ѯ���û������Ķ���
    private List<Orders> ordersList;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return "User [uid=" + uid + ",uname=" + uname + ",usex=" + usex + ",ordersList=" + ordersList + "]";
    }
}
