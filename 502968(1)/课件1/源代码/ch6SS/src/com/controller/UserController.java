package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.dao.UserDao;
import com.po.MyUser;

@Controller("userController")
public class UserController {
    @Autowired
    private UserDao userDao;

    public void test() {
        //��ѯһ���û�
        MyUser auser = userDao.selectUserById(1);
        System.out.println(auser);
        System.out.println("================");
        //���һ���û�
        MyUser addmu = new MyUser();
        addmu.setUname("�º�");
        addmu.setUsex("��");
        int add = userDao.addUser(addmu);
        System.out.println("�����" + add + "����¼");
        System.out.println("================");
        //�޸�һ���û�
        MyUser updatemu = new MyUser();
        updatemu.setUid(1);
        updatemu.setUname("����");
        updatemu.setUsex("Ů");
        int up = userDao.updateUser(updatemu);
        System.out.println("�޸���" + up + "����¼");
        System.out.println("================");
        //ɾ��һ���û�
        int dl = userDao.deleteUser(9);
        System.out.println("ɾ����" + dl + "����¼");
        System.out.println("================");
        //��ѯ�����û�
        List<MyUser> list = userDao.selectAllUser();
        for (MyUser myUser : list) {
            System.out.println(myUser);
        }
    }
}
