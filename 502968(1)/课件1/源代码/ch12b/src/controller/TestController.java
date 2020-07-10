package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.Person;

@Controller
public class TestController {
    /**
     * ����ҳ�������JSON���ݣ�������JSON��ʽ���
     */
    @RequestMapping("/testJson")
    @ResponseBody
    public Person testJson(@RequestBody Person user) {
        //��ӡ���յ�JSON��ʽ����
        System.out.println("pname=" + user.getPname() +
                ", password=" + user.getPassword() + ",page=" + user.getPage());
        //����JSON��ʽ����Ӧ
        return user;
    }
}
