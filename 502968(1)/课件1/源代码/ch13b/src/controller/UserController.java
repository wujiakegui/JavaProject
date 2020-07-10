package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;

@Controller
public class UserController {
    /**
     * ��¼ҳ���ʼ��
     */
    @RequestMapping("/toLogin")
    public String initLogin() {
        return "login";
    }

    /**
     * �����¼����
     */
    @RequestMapping("/login")
    public String login(User user, Model model, HttpSession session) {
        System.out.println(user.getUname());
        if ("chenheng".equals(user.getUname()) &&
                "123456".equals(user.getUpwd())) {
            session.setAttribute("user", user);
            //�ض�����ҳ�����ת����
            return "redirect:main";
        }
        model.addAttribute("msg", "�û�����������������µ�¼��");
        return "login";
    }

    /**
     * ��ת����ҳ��
     */
    @RequestMapping("/main")
    public String toMain() {
        return "main";
    }

    /**
     * �˳���¼
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        //���session
        session.invalidate();
        return "login";
    }
}
