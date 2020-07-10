package learn_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class JDBCForLogin {
    public static void main(String[] args) throws SQLException {

        Connection conn = null;
        PreparedStatement stat = null;
        ResultSet resu = null;

        // 登录
        System.out.println("请输入登录账号：");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        System.out.println("请输入登录密码：");
        String password = sc.next();

        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 创建Connection对象
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?useUnicode=true&characterEncoding=UTF-8&useSSL=false", "root", "xiao");
            // 3. 使用Connection来创建一个PreparedStatement对象    ?==占位符
            String sql = "select username,password from t_user where username=? and password=?";
            // 预编译好SQL语句
            PreparedStatement ptmt = conn.prepareStatement(sql);
            // 为每一个占位符赋值
            ptmt.setString(1, username);
            ptmt.setString(2, password);
            resu = ptmt.executeQuery();

            if (resu.next()) {
                System.out.println("登录成功");
            } else {
                System.out.println("登录失败");
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // 判断，避免了NullPointerException
            try {
                if (resu != null) {
                    resu.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
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
