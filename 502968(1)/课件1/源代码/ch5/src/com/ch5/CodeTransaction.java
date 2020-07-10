package com.ch5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Repository("codeTransaction")
public class CodeTransaction {
    @Autowired
    // ʹ�������ļ��е�JDBCģ��
    private JdbcTemplate jdbcTemplate;
    //DataSourceTransactionManager��PlatformTransactionManager�ӿڵ�ʵ����
    @Autowired
    private DataSourceTransactionManager txManager;

    public String test() {
        // Ĭ�������壬����뼶�𡢴�����Ϊ��
        TransactionDefinition tf = new DefaultTransactionDefinition();
        // ��������ts
        TransactionStatus ts = txManager.getTransaction(tf);
        String message = "ִ�гɹ���û������ع���";
        try {
            // ɾ����������
            String sql = " delete from user  ";
            // �������
            String sql1 = " insert into user values(?,?,?) ";
            Object param[] = {1, "�º�", "��"};
            // ��ɾ������
            jdbcTemplate.update(sql);
            // ���һ������
            jdbcTemplate.update(sql1, param);
            // �����ͬ��һ�����ݣ�ʹ�����ظ�
            jdbcTemplate.update(sql1, param);
            // �ύ����
            txManager.commit(ts);
        } catch (Exception e) {
            // �����쳣������ع�
            txManager.rollback(ts);
            message = "�����ظ�������ع���";
            e.printStackTrace();
        }
        return message;
    }
}
