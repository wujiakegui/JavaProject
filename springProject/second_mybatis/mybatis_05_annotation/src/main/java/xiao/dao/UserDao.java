package xiao.dao;


import org.apache.ibatis.annotations.*;
import xiao.pojo.User;

import java.util.List;

public interface UserDao {
    // 查
    @Select("select * from mybatis.user")
    List<User> getUser();

    // 通过id查询
    // 方法存在多个参数，所有的参数前面必须加上@Param（"参数名"）注解
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

    // 增
    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);

    // 改
    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    int updateUser(User user);

    // 删
    @Delete("delete from user where id=#{id}")
    int deleteUser(@Param("id") int id);
}
