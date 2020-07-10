package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dao.UserDao;
import com.po.MyUser;
import com.pojo.MapUser;
import com.pojo.SeletUserParam;

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
        System.out.println("��Ӽ�¼��������" + addmu.getUid());
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
        //��ѯ����û�
		/*Map<String, Object> map = new HashMap<>();
		map.put("u_name", "��");
		map.put("u_sex", "��");
		List<MyUser> list = userDao.selectAllUser(map);
		*/
        SeletUserParam su = new SeletUserParam();
        su.setU_name("��");
        su.setU_sex("��");
        List<MyUser> list = userDao.selectAllUser(su);
        for (MyUser myUser : list) {
            System.out.println(myUser);
        }
        System.out.println("================");
        //ʹ��resultMapӳ������
        List<MapUser> listResultMap = userDao.selectResultMap();
        for (MapUser myUser : listResultMap) {
            System.out.println(myUser);
        }
        System.out.println("================");
        //��ѯ�����û���Ϣ�浽Map�� 
        List<Map<String, Object>> lmp = userDao.selectAllUserMap();
        for (Map<String, Object> map : lmp) {
            System.out.println(map);
        }
    }
}
