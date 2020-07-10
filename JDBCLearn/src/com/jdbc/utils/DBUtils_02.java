package com.jdbc.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DBUtils_02 {
    private static String driver = null;
    private static String url = null;
    private static String user = null;
    private static String password = null;
    private static Connection connection = null;

    static {
        try {
            // 通过流读取文件
            InputStream inputStream = DBUtils_02.class.getClassLoader().getResourceAsStream("db.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            driver = properties.getProperty("driver");
            // 1.注册驱动
            Class.forName(driver);
        } catch (ClassNotFoundException | IOException e) {
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
