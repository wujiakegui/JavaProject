package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dao.UserDao;
import com.po.MyUser;

@Service("userService")
@Transactional
/**����ע��@Transactional,����ָ���������Ҫ��Spring���������
 ע��@Transactionalֻ�����public���Է�Χ�ڵķ�����ӣ�
 ������������Ҫ��������������ֻ�Ǹ��߶������ʹ������*/
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<MyUser> selectUserByUname(MyUser user) {
        return userDao.selectUserByUname(user);
    }
}
