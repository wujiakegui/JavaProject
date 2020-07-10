package com.ch5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("testDao")
public class TestDaoImpl implements TestDao {
    @Autowired
    //ʹ�������ļ��е�JDBCģ��
    private JdbcTemplate jdbcTemplate;

    /**
     * ���·�����������ӡ��޸ġ�ɾ��
     * paramΪsql�еĲ�������ͨ���?
     */
    @Override
    public int update(String sql, Object[] param) {
        return jdbcTemplate.update(sql, param);
    }

    /**
     * ��ѯ����
     * paramΪsql�еĲ�������ͨ���?
     */
    @Override
    public List<MyUser> query(String sql, Object[] param) {
        RowMapper<MyUser> rowMapper = new BeanPropertyRowMapper<MyUser>(MyUser.class);
        return jdbcTemplate.query(sql, rowMapper, param);
    }
}
