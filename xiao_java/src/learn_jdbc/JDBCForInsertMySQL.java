package learn_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCForInsertMySQL {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ptmt = null;


        // 插 插入
        System.out.println("请输入插入账号：");
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        System.out.println("请输入插入密码：");
        String password = sc.next();

        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 创建Connection对象
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?useUnicode=true&characterEncoding=UTF-8&useSSL=false", "root", "xiao");
            // 3. 使用Connection来创建一个PreparedStatement对象    ?==占位符
            String sql = "insert into t_user(username,password) values (?,?)";
            // 预编译好SQL语句
            ptmt = conn.prepareStatement(sql);
            // 为每一个占位符赋值
            ptmt.setString(1, username);
            ptmt.setString(2, password);

            int result = ptmt.executeUpdate();

            if (result > 0) {
                System.out.println("新增成功");
            } else {
                System.out.println("失败");
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
                if (ptmt != null) {
                    ptmt.close();
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
