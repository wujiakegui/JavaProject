package com.statement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.statement.dao.TestDao;

@Service("testService")
@Transactional
//����ע��@Transactional,�Ϳ���ָ���������Ҫ��Spring���������
//ע��@Transactionalֻ�����public���Է�Χ�ڵķ������
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    @Override
    public int save(String sql, Object[] param) {
        return testDao.save(sql, param);
    }

    @Override
    public int delete(String sql, Object[] param) {
        return testDao.delete(sql, param);
    }
}
