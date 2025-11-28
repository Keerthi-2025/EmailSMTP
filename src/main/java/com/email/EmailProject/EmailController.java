package com.email.EmailProject;


import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class EmailController {

    @Autowired
    private JavaMailSender mailSender;

    public EmailController(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
    @RequestMapping("/send-email")
    public  String sendEmail() {
        try
        {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("rhkirthi3@gmail.com");
        message.setTo("rhkirthi3@gmail.com");
        message.setSubject("Simple Email Test");
        message.setText("Hello this is test email");

        mailSender.send(message);
        return  "success";

    }catch(Exception e){
        return e.getMessage();
    }
}





    @RequestMapping("/send-emailAttactment")
    public  String sendEmailAttactment() {
        try
        {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message,true);

            helper.setFrom("rhkirthi3@gmail.com");
            helper.setTo("rhkirthi3@gmail.com");
            helper.setSubject("Simple Email Test");
            helper.setText("Please find the attachment");

            helper.addAttachment("certificate.pdf", new File("C:\\Users\\HP\\Downloads\\certificate.pdf"));

            mailSender.send(message);
            return  "success";

        }catch(Exception e){
            return e.getMessage();
        }
    }
}



