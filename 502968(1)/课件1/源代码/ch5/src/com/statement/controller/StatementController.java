package com.statement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.statement.service.TestService;

@Controller("statementController")
public class StatementController {
    @Autowired
    private TestService testService;

    public String test() {
        String message = "";
        String deleteSql = "delete from user";
        String saveSql = "insert into user values(?,?,?)";
        Object param[] = {1, "chenheng", "��"};
        try {
            testService.delete(deleteSql, null);
            testService.save(saveSql, param);
            //�������������ظ�������
            testService.save(saveSql, param);
        } catch (Exception e) {
            message = "�����ظ�������ع���";
            e.printStackTrace();
        }
        return message;
    }
}
