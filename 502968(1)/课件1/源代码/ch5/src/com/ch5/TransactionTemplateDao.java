package com.ch5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Repository("transactionTemplateDao")
public class TransactionTemplateDao {
    @Autowired
    //ʹ�������ļ��е�JDBCģ��
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private TransactionTemplate transactionTemplate;
    String message = "";

    public String test() {
        //�������ڲ���ķ�ʽʵ��TransactionCallback �ӿڣ�ʹ��Ĭ�ϵ������ύ�ͻع�������ҵ������в���Ҫ��ʽ�����κ��������API
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus arg0) {
                //ɾ����������
                String sql = " delete from user  ";
                //�������
                String sql1 = " insert into user values(?,?,?) ";
                Object param[] = {
                        1,
                        "�º�",
                        "��"
                };
                try {
                    //��ɾ������
                    jdbcTemplate.update(sql);
                    //���һ������
                    jdbcTemplate.update(sql1, param);
                    //�����ͬ��һ�����ݣ�ʹ�����ظ�
                    jdbcTemplate.update(sql1, param);
                    message = "ִ�гɹ���û������ع���";
                } catch (Exception e) {
                    message = "�����ظ�������ع���";
                    e.printStackTrace();
                }
                return message;
            }
        });
        return message;
    }
}
