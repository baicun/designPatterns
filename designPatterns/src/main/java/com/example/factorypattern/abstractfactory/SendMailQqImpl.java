package com.example.factoryPattern.abstractfactory;

import com.example.factoryPattern.factory.Send;

//QQ邮件实现类
public class SendMailQqImpl implements Send {
    @Override
    public void send() {
        System.out.println("发送QQ邮件");
    }
}
