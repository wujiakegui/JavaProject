package com.jdbc.jdbc01;

import java.sql.*;


public class ConnMySql {
    public static void main(String[] args) throws Exception {
        createTable("create table jdbc_test "
                + "( jdbc_id int auto_increment primary key, "
                + "jdbc_name varchar(255), "
                + "jdbc_desc text);");
        System.out.println("-----建表成功-----");
    }

    public static void createTable(String sql) throws Exception {
        // 加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 获取数据库连接
        Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/practice" + "?characterEncoding=UTF-8&amp;useSSL=true", "root", "xiao");
        // 使用Connection来创建一个Statment对象
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
    }
}