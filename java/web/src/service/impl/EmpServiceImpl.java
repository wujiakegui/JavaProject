package service.impl;

import beans.Emp;
import dao.EmoDao;
import dao.impl.EmpDaoImpl;
import service.EmpService;

import java.util.Date;
import java.util.List;

public class EmpServiceImpl implements EmpService {
    private EmoDao empDao = new EmpDaoImpl();

    @Override
    public List<Emp> getAllEmp() {
        return empDao.getAllEmp();
    }

    @Override
    public Emp getEmp(int empno) {
        return empDao.getEmp(empno);
    }

    @Override
    public int updateEmp(int empno, String ename, String job, int mgr, Date hiredate, double sal, double comm, int deptno) {
        Emp emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
        return empDao.updateEmp(emp);
    }

    @Override
    public int deleteEmp(int empno) {
        return empDao.deleteEmp(empno);
    }

    @Override
    public int insertEmp(int empno, String ename, String job, int mgr, Date hiredate, double sal, double comm, int deptno) {
        Emp emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
        return empDao.insertEmp(emp);
    }
}
