package controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.UserForm;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    //�õ�һ��������¼��־�Ķ���������ӡ��Ϣ��ʱ���ܹ���Ǵ�ӡ�����Ǹ������Ϣ
    private static final Log logger = LogFactory.getLog(UserController.class);
    //����������ע�뵽����userService
    @Autowired
    public UserService userService;

    /**
     * �����¼
     */
    @RequestMapping("/login")
    public String login(UserForm user, HttpSession session, Model model) {
        if (userService.login(user)) {
            session.setAttribute("u", user);
            logger.info("�ɹ�");
            return "main";//��¼�ɹ�����ת��main.jsp
        } else {
            logger.info("ʧ��");
            model.addAttribute("messageError", "�û������������");
            return "login";
        }
    }

    /**
     * ����ע��
     */
    @RequestMapping("/register")
    public String register(@ModelAttribute("user") UserForm user) {
        if (userService.register(user)) {
            logger.info("�ɹ�");
            return "login";//ע��ɹ�����ת��login.jsp
        } else {
            logger.info("ʧ��");
            //ʹ��@ModelAttribute("user")��model.addAttribute("user", user)������ͬ
            //��register.jspҳ���Ͽ���ʹ��EL���ʽ${user.uname}ȡ��ModelAttribute��unameֵ
            return "register";//����register.jsp
        }
    }
}
