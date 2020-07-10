package com.jdbc.jdbc01;


import java.util.*;
import java.io.*;
import java.sql.*;

public class PreparedStatementTest {
    static String mysqlDriver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/practice";
    static String newUrl = "jdbc:mysql://localhost:3306/";
    static String username = "root";
    static String password = "xiao";
    static Connection conn = null;
    static Connection newConn = null;

    public void initParam(String paramFile) throws Exception {
        // 使用Properties类来加载属性文件
        Properties props = new Properties();
        props.load(new FileInputStream(paramFile));  // 版本问题 换成低版本就可以1.7
        mysqlDriver = props.getProperty("driver");
        url = props.getProperty("url");
        username = props.getProperty("username");
        password = props.getProperty("password");
        // 加载驱动
        Class.forName(mysqlDriver);
    }

    public void insertUseStatement() throws Exception {
        long start = System.currentTimeMillis();
        // 获取数据库连接
        Connection conn = (Connection) DriverManager.getConnection(url, username, password);
        // 使用Connection来创建一个Statment对象
        Statement stmt = conn.createStatement();
        {
            // 需要使用100条SQL语句来插入100条记录
            for (int i = 0; i < 100; i++) {
                stmt.executeUpdate("insert into t_user values("
                        + "1 ,'姓名" + i + "' , 1)");
            }
            System.out.println("使用Statement费时:"
                    + (System.currentTimeMillis() - start));
        }
    }

    public void insertUsePrepare() throws Exception {
        long start = System.currentTimeMillis();
        // 获取数据库连接
        Connection conn = (Connection) DriverManager.getConnection(url, username, password);
        // 使用Connection来创建一个PreparedStatement对象
        PreparedStatement pstmt = conn.prepareStatement("insert into t_user values(2,?,1)");
        {
            // 100次为PreparedStatement的参数设值，就可以插入100条记录
            for (int i = 0; i < 100; i++) {
                pstmt.setString(1, "姓名" + i);
                pstmt.executeUpdate();
            }
            System.out.println("使用PreparedStatement费时:"
                    + (System.currentTimeMillis() - start));
        }
    }

    public static void main(String[] args) throws Exception {
        PreparedStatementTest pt = new PreparedStatementTest();
        pt.insertUseStatement();
        pt.insertUsePrepare();
    }
}