package controller;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.User;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    // �õ�һ��������¼��־�Ķ���������ӡ��Ϣ��ʱ���ܹ���Ǵ�ӡ�����Ǹ������Ϣ
    private static final Log logger = LogFactory.getLog(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/input")
    public String inputUser(Model model) {
        HashMap<String, String> hobbys = new HashMap<String, String>();
        hobbys.put("����", "����");
        hobbys.put("ƹ����", "ƹ����");
        hobbys.put("����", "����");
        hobbys.put("��Ӿ", "��Ӿ");
        // ���model��û��user���ԣ�userAdd.jsp���׳��쳣����Ϊ����ǩ�޷��ҵ�
        // modelAttribute����ָ����form backing object
        model.addAttribute("user", new User());
        model.addAttribute("hobbys", hobbys);
        model.addAttribute("carrers", new String[]{"��ʦ", "ѧ��", "coding���˹�", "IT��", "����"});
        model.addAttribute("houseRegisters", new String[]{"����", "�Ϻ�", "����", "����", "����"});
        return "userAdd";
    }

    @RequestMapping(value = "/save")
    public String addUser(@ModelAttribute User user, Model model) {
        if (userService.addUser(user)) {
            logger.info("�ɹ�");
            return "redirect:/user/list";
        } else {
            logger.info("ʧ��");
            HashMap<String, String> hobbys = new HashMap<String, String>();
            hobbys.put("����", "����");
            hobbys.put("ƹ����", "ƹ����");
            hobbys.put("����", "����");
            hobbys.put("��Ӿ", "��Ӿ");
            // ���ﲻ��Ҫmodel.addAttribute("user", new
            // User())����Ϊ@ModelAttributeָ��form backing object
            model.addAttribute("hobbys", hobbys);
            model.addAttribute("carrers", new String[]{"��ʦ", "ѧ��", "coding���˹�", "IT��", "����"});
            model.addAttribute("houseRegisters", new String[]{"����", "�Ϻ�", "����", "����", "����"});
            return "userAdd";
        }
    }

    @RequestMapping(value = "/list")
    public String listUsers(Model model) {
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "userList";
    }
}
