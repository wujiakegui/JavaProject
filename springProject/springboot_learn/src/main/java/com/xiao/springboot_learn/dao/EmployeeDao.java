package com.xiao.springboot_learn.dao;

import com.xiao.springboot_learn.pojo.Department;
import com.xiao.springboot_learn.pojo.Employee;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// 员工dao
@Service
public class EmployeeDao {
    // 模拟数据库中的数据
    private static Map<Integer, Employee> employees = null;
    // 员工所属的部门
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer, Employee>(); //创建一个部门表
        employees.put(101, new Employee(1001, "AA", "A1091164612@qq.com", 0, new Department(101, "教学部")));
        employees.put(102, new Employee(1002, "BB", "B1091164612@qq.com", 1, new Department(102, "市场部")));
        employees.put(103, new Employee(1003, "CC", "C1091164612@qq.com", 1, new Department(103, "教研部")));
        employees.put(104, new Employee(1004, "DD", "D1091164612@qq.com", 0, new Department(104, "运营部")));
        employees.put(105, new Employee(1005, "EE", "E1091164612@qq.com", 1, new Department(105, "后勤部")));
    }

    private static Integer initId = 1006;

    // 增加一个员工
    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartments(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);
    }

    // 查询全部员工信息
    public Collection<Employee> getAll() {
        return employees.values();
    }

    // 通过id查询员工
    public Employee getElementsById(Integer id) {
        return employees.get(id);
    }

    // 删除员工通过id
    public void delete(Integer id) {
        employees.remove(id);
    }

}
