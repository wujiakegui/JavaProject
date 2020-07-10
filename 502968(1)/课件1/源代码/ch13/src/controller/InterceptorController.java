package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {
    @RequestMapping("/gotoTest")
    public String gotoTest() {
        System.out.println("���ڲ�����������ִ�п������Ĵ������󷽷���");
        return "test";
    }
}
