package com.jdbc.utils;

import java.sql.*;

public class DBUtils {
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/practice?serverTimezone=Asia/Shanghai&useSSL=true&useUnicode=true&characterEncoding=UTF-8";
    private static String user = "root";
    private static String password = "xiao";
    private static Connection connection = null;

    static {
        try {
            // 1.注册驱动
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 2. 获得连接
    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 3. 释放资源
    public static void closeAll(ResultSet resultSet, Statement statement, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
