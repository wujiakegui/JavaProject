package dao.impl;

import beans.Emp;

import dao.EmoDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.DruidUtils;

import java.sql.SQLException;
import java.util.List;

public class EmpDaoImpl implements EmoDao {

    private QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());

    @Override
    public List<Emp> getAllEmp() {
        try {
            return queryRunner.query("select * from emp;", new BeanListHandler<Emp>(Emp.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Emp getEmp(int empno) {
        try {
            return queryRunner.query("select * from emp where empno=?", new BeanHandler<>(Emp.class), empno);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int updateEmp(Emp emp) {
        Object[] params = {emp.getEname(), emp.getJob(), emp.getMgr(), emp.getHiredate(), emp.getSal(), emp.getComm(), emp.getDeptno(), emp.getEmpno()};
        try {
            return queryRunner.update("update emp set ename=?,job=?,mgr=?,hiredate=?,sal=?,comm=?,deptno=? where empno =?", params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteEmp(int empno) {
        try {
            return queryRunner.update("delete from emp where empno=?", empno);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insertEmp(Emp emp) {
        Object[] params = {emp.getEmpno(), emp.getEname(), emp.getJob(), emp.getMgr(), emp.getHiredate(), emp.getSal(), emp.getComm(), emp.getDeptno()};

        try {
            return queryRunner.update("insert into emp (empno,ename,job,mgr,hiredate,sal,comm,deptno)values(?,?,?,?,?,?,?,?)", params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Emp> getAllEmpByPages(int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public long getEmpCount() {
        return 0;
    }
}
