package com.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.mybatis.po.MyUser;

public class MyBatisTest {
    public static void main(String[] args) {
        try {
            //��ȡ�����ļ�mybatis-config.xml
            InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
            //���������ļ�����SqlSessionFactory
            SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
            //ͨ��SqlSessionFactory����SqlSession
            SqlSession ss = ssf.openSession();
            //SqlSessionִ��ӳ���ļ��ж����SQL��������ӳ����
            //com.mybatis.mapper.UserMapper.selectUserByIdΪUserMapper.xml�е������ռ�+select��id
            //��ѯһ���û�
            MyUser mu = ss.selectOne("com.mybatis.mapper.UserMapper.selectUserById", 1);
            System.out.println(mu);
            //���һ���û�
            MyUser addmu = new MyUser();
            addmu.setUname("�º�");
            addmu.setUsex("��");
            ss.insert("com.mybatis.mapper.UserMapper.addUser", addmu);
            //�޸�һ���û�
            MyUser updatemu = new MyUser();
            updatemu.setUid(1);
            updatemu.setUname("����");
            updatemu.setUsex("Ů");
            ss.update("com.mybatis.mapper.UserMapper.updateUser", updatemu);
            //ɾ��һ���û�
            ss.delete("com.mybatis.mapper.UserMapper.deleteUser", 3);
            //��ѯ�����û�
            List<MyUser> listMu = ss.selectList("com.mybatis.mapper.UserMapper.selectAllUser");
            for (MyUser myUser : listMu) {
                System.out.println(myUser);
            }
            //�ύ����
            ss.commit();
            //�ر�SqlSession
            ss.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
