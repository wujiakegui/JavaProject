package com.jdbc.jdbc01;

import com.jdbc.utils.DBUtils_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1. 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2. 创建Connection对象
        Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/practice" + "?characterEncoding=UTF-8&amp;useSSL=true", "root", "xiao");
        // 3. 使用Connection来创建一个Statment对象
        Statement stat = conn.createStatement();
        // 4. sql语句
        String sql = "create table if not exists test(id int primary key,name varchar(20) not null)charset=utf8;";
        // 执行DDL execute()方法
        boolean result = stat.execute(sql);
        // 执行DML
        stat.execute("insert into test(id,name) values (001,'xiao')");
        System.out.println(result);
        // 关闭释放资源
        stat.close();
        conn.close();
        // excute
    }
}
