package com.xiao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class SpringbootTaskApplicationTests {
//    @Autowired
//    JavaMailSenderImpl mailSender;
//    // 一个简单的邮件
//    @Test
//    void contextLoads() {
//        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//        simpleMailMessage.setSubject("儿子");
//        simpleMailMessage.setText("你快乐吗");
//        simpleMailMessage.setTo("921090271@qq.com");
////        simpleMailMessage.setFrom("1091164612@qq.com");
//        simpleMailMessage.setFrom("1091164612@qq.com");
//        mailSender.send(simpleMailMessage);
//    }
//    // 一个复杂的邮件
//    @Test
//    void contextLoads1() throws MessagingException {
//
//        MimeMessage mimeMessage = mailSender.createMimeMessage();
//        // 组装
//        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
//        // 正文
//        helper.setSubject("kegui");
//        helper.setText("<p style='color:red>可归，你快乐吗</p>",true);
//        // 附件
//        helper.addAttachment("1.png",new File("C:\\Users\\HP\\Desktop\\1.png"));
//        helper.addAttachment("2.png",new File("C:\\Users\\HP\\Desktop\\1.png"));
//        // 发送
//        helper.setTo("1091164612@qq.com");
//        helper.setFrom("1091164612@qq.com");
//        mailSender.send(mimeMessage);
//    }
}
