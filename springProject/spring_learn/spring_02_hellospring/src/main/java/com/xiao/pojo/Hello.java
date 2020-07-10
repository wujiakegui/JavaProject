package com.xiao.pojo;

import java.security.SecureRandom;

public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "str='" + str + '\'' +
                '}';
    }
}
