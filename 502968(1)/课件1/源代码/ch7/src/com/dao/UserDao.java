package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.pojo.MapUser;
import com.pojo.SelectUserOrdersById;
import com.po.MyUser;
import com.pojo.SeletUserParam;

@Repository("userDao")
@Mapper
/*ʹ��Spring�Զ�ɨ��MyBatis�Ľӿڲ�װ��
��Spring��ָ���������б�@Mapperע���ע�Ľӿ��Զ�װ��ΪMyBatis��ӳ��ӿ�*/
public interface UserDao {
    /**
     * �ӿڷ�����ӦSQLӳ���ļ�UserMapper.xml�е�id
     */
    public MyUser selectUserById(Integer uid);

    //public List<MyUser> selectAllUser(Map<String, Object> param);
    public List<MyUser> selectAllUser(SeletUserParam param);

    public List<MapUser> selectResultMap();

    public int addUser(MyUser user);

    public int updateUser(MyUser user);

    public int deleteUser(Integer uid);

    public List<Map<String, Object>> selectAllUserMap();

    public MyUser selectUserOrdersById1(Integer uid);

    public MyUser selectUserOrdersById2(Integer uid);

    public List<SelectUserOrdersById> selectUserOrdersById3(Integer uid);
}
