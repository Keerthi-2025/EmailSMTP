package com.email.EmailProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

        mailSender.send(message);
        return  "success";

    }catch(Exception e){
        return e.getMessage();
    }
}
}
