package com.xiao.pojo;

// 实体类
public class User {
    private int id;
    private String name;
    private String pwd;

    public User() {
    }

    public User(int id, String mame, String pwd) {
        this.id = id;
        this.name = mame;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMame() {
        return name;
    }

    public void setMame(String mame) {
        this.name = mame;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", mame='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
