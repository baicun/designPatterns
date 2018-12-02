package com.example.factorypattern.factory;

//发送邮件
public class MailSend implements Send {
    @Override
    public void send() {
        System.out.println("发送邮件成功");
    }
}
