package com.controller;

import java.util.ArrayList;
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
        /**
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
         System.out.println( "================");
         //ɾ��һ���û�
         int dl = userDao.deleteUser(9);
         System.out.println("ɾ����" + dl + "����¼");
         System.out.println("================");
         //��ѯ�����û�
         List<MyUser> list = userDao.selectAllUser();
         for (MyUser myUser : list) {
         System.out.println(myUser);
         }**/
        //ʹ��ifԪ�ز�ѯ�û���Ϣ
        MyUser ifmu = new MyUser();
        ifmu.setUname("��");
        ifmu.setUsex("Ů");
        List<MyUser> listByif = userDao.selectUserByIf(ifmu);
        System.out.println("ifԪ��================");
        for (MyUser myUser : listByif) {
            System.out.println(myUser);
        }
        //ʹ��chooseԪ�ز�ѯ�û���Ϣ
        MyUser choosemu = new MyUser();
        choosemu.setUname("");
        choosemu.setUsex("");
        List<MyUser> listByChoose = userDao.selectUserByChoose(choosemu);
        System.out.println("chooseԪ��================");
        for (MyUser myUser : listByChoose) {
            System.out.println(myUser);
        }
        //ʹ��trimԪ�ز�ѯ�û���Ϣ
        MyUser trimmu = new MyUser();
        trimmu.setUname("��");
        trimmu.setUsex("��");
        List<MyUser> listByTrim = userDao.selectUserByTrim(trimmu);
        System.out.println("trimԪ��================");
        for (MyUser myUser : listByTrim) {
            System.out.println(myUser);
        }
        //ʹ��whereԪ�ز�ѯ�û���Ϣ
        MyUser wheremu = new MyUser();
        wheremu.setUname("��");
        wheremu.setUsex("��");
        List<MyUser> listByWhere = userDao.selectUserByWhere(wheremu);
        System.out.println("whereԪ��================");
        for (MyUser myUser : listByWhere) {
            System.out.println(myUser);
        }
        //ʹ��setԪ���޸�һ���û�
        MyUser setmu = new MyUser();
        setmu.setUid(1);
        setmu.setUname("�ž�");
        int setup = userDao.updateUserBySet(setmu);
        System.out.println("setԪ���޸���" + setup + "����¼");
        System.out.println("================");
        //ʹ��foreachԪ�أ���ѯ�û���Ϣ
        List<Integer> listId = new ArrayList<Integer>();
        listId.add(34);
        listId.add(37);
        List<MyUser> listByForeach = userDao.selectUserByForeach(listId);
        System.out.println("foreachԪ��================");
        for (MyUser myUser : listByForeach) {
            System.out.println(myUser);
        }
        //ʹ��bindԪ�ز�ѯ�û���Ϣ
        MyUser bindmu = new MyUser();
        bindmu.setUname("��");
        List<MyUser> listByBind = userDao.selectUserByBind(bindmu);
        System.out.println("bindԪ��================");
        for (MyUser myUser : listByBind) {
            System.out.println(myUser);
        }
    }
}
