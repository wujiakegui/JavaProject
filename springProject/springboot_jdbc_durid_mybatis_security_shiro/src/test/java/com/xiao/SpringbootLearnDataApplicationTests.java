package com.xiao;

import com.xiao.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;



@SpringBootTest
class SpringbootLearnDataApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    UserServiceImpl userService;

    @Test
    void contextLoads(){
        System.out.println(userService.queryByName("黄笑"));
    }

//    @Test
//    void contextLoads() throws SQLException {
//        // 查看一下默认的数据源    class com.zaxxer.hikari.HikariDataSource
//        System.out.println(dataSource.getClass());
//        // 获取数据库连接
//        Connection connection = dataSource.getConnection();
//        System.out.println(connection);
//
//        // 关闭
//        connection.close();
//
//    }
}
