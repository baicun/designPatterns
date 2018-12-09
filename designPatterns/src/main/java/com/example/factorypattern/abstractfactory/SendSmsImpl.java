package com.example.factoryPattern.abstractfactory;

import com.example.factoryPattern.factory.Send;

//短信实现类
public class SendSmsImpl implements Send {
    @Override
    public void send() {
        System.out.println("发送短信，到SC");
    }
}
