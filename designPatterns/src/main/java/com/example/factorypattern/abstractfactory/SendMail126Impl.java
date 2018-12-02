package com.example.factorypattern.abstractfactory;

import com.example.factorypattern.factory.Send;

//126邮件实现类
public class SendMail126Impl implements Send{
    @Override
    public void send() {
        System.out.println("发送126邮件");
    }
}
