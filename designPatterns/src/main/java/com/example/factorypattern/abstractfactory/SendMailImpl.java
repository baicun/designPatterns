package com.example.factorypattern.abstractfactory;

import com.example.factorypattern.factory.Send;

//邮件实现类
public class SendMailImpl implements Send{
    @Override
    public void send() {
        System.out.println("发送邮件，使用POP协议");
    }
}
