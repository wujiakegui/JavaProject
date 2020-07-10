package controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import exception.MyException;
import service.TestExceptionService;

@Controller
public class TestExceptionController {
    @Autowired
    private TestExceptionService testExceptionService;

    @RequestMapping("/db")
    public void db() throws Exception {
        throw new SQLException("�����������ݿ��쳣");
    }

    @RequestMapping("/my")
    public void my() throws Exception {
        throw new MyException("���������Զ����쳣");
    }

    @RequestMapping("/no")
    public void no() throws Exception {
        throw new Exception("��������δ֪�쳣");
    }

    @RequestMapping("/servicedb")
    public void servicedb() throws Exception {
        testExceptionService.servicedb();
        ;
    }

    @RequestMapping("/servicemy")
    public void servicemy() throws Exception {
        testExceptionService.servicemy();
    }

    @RequestMapping("/serviceno")
    public void serviceno() throws Exception {
        testExceptionService.serviceno();
    }

    @RequestMapping("/daodb")
    public void daodb() throws Exception {
        testExceptionService.daodb();
    }

    @RequestMapping("/daomy")
    public void daomy() throws Exception {
        testExceptionService.daomy();
    }

    @RequestMapping("/daono")
    public void daono() throws Exception {
        testExceptionService.daono();
    }
}
