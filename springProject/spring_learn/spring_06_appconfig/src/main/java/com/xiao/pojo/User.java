package com.xiao.pojo;

import org.springframework.beans.factory.annotation.Value;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("可归")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
