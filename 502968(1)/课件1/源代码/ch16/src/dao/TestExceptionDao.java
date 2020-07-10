package dao;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;
import exception.MyException;

@Repository("testExceptionDao")
public class TestExceptionDao {
    public void daodb() throws Exception {
        throw new SQLException("Dao�����ݿ��쳣");
    }

    public void daomy() throws Exception {
        throw new MyException("Dao���Զ����쳣");
    }

    public void daono() throws Exception {
        throw new Exception("Dao��δ֪�쳣");
    }
}
