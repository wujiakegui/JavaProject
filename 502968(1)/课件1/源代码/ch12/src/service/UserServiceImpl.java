package service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import pojo.User;

@Service
public class UserServiceImpl implements UserService {
    //ʹ�þ�̬���ϱ���usersģ�����ݿ�
    private static ArrayList<User> users = new ArrayList<User>();

    @Override
    public boolean addUser(User u) {
        if (!"IT��".equals(u.getCarrer())) {//���������IT��
            users.add(u);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<User> getUsers() {
        return users;
    }
}
