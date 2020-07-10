package com.jdbc.jdbc01;

import java.sql.*;

public class Jdbc_CRUD {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 数据库连接
        String database = "practice";
        Jdbc_CRUD.getConn(database);
        // 创建表
//	 Jdbc_CRUD.createTable();
        // 插入
//	Jdbc_CRUD.insertData();
        // 删除
//	Jdbc_CRUD.deleteData();
        // 修改
//	Jdbc_CRUD.updateData();
//	查询表
        Jdbc_CRUD.selectTable();
        //关闭资源
        if (conn != null) {
            conn.close();
        }
    }

    static String mysqlDriver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/practice?serverTimezone=Asia/Shanghai&useSSL=true&useUnicode=true&characterEncoding=UTF-8";
    static String newUrl = "jdbc:mysql://localhost:3306/";
    static String username = "root";
    static String password = "xiao";
    static Connection conn = null;
    static Connection newConn = null;

    // 数据库连接
    public static void getConn(String database) throws SQLException {
        try {
            Class.forName(mysqlDriver);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block  
            e.printStackTrace();
        }
        conn = (Connection) DriverManager.getConnection(url, username, password);
        if (conn != null) {
            System.out.println("数据库连接成功！");
        }
    }

    // 创建表
    public static void createTable() throws SQLException {
        String tableSql = "create table t_user(username varchar(50) not null primary key," + "password varchar(20) not null ); ";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(tableSql);
    }

    // 增——插入
    public static void insertData() throws SQLException {
        String selectTable = "insert into t_user (username,password) values ('可归',123654),('笑',333),('羡',222),('华',444),('念',555)";
        Statement stmt = conn.createStatement();
        stmt.execute(selectTable);
    }

    // 删——删除
    public static void deleteData() throws SQLException {
        String selectTable = "DELETE FROM t_user WHERE username='huang'";
        Statement stmt = conn.createStatement();
        stmt.execute(selectTable);
    }

    //改——修改
    public static void updateData() throws SQLException {
        String selectTable = "UPDATE t_user SET username = 'huang' WHERE username = 'xiao' ";
        Statement stmt = conn.createStatement();
        stmt.execute(selectTable);
    }

    //查——查询
    public static void selectTable() throws SQLException {
        String selectTable = "select * from t_user";    // 编写查询SQL语句
        Statement stmt = conn.createStatement();        // 创建statement对象
        ResultSet rs = stmt.executeQuery(selectTable);    // 执行SQL语句，传值给ResultSet结果集
        while (rs.next()) {                // 遍历输出查询结果
            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t");
        }
        conn.close();   // 关闭数据库连接
    }
}
