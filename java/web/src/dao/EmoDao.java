package dao;

import beans.Emp;

import java.util.List;

public interface EmoDao {
    List<Emp> getAllEmp();

    Emp getEmp(int empno);

    int updateEmp(Emp emp);

    int deleteEmp(int empno);

    int insertEmp(Emp emp);

    List<Emp> getAllEmpByPages(int pageIndex, int pageSize);

    long getEmpCount();
    //select * from emp limit 0,3;  1  3
//    List<Emp> getAllEmpByPages(int pageIndex,int pageSize);
//    long getEmpCount();
}
