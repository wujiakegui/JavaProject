package com.jdbc.jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCForDML {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;
        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 创建Connection对象
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/practice" + "?characterEncoding=UTF-8&amp;useSSL=true", "root", "xiao");
            // 3. 使用Connection来创建一个Statment对象
            stat = conn.createStatement();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // 判斷，避免了NullPointerException
            try {
                if (stat != null) {
                    stat.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
