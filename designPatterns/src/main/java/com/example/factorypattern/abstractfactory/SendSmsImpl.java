package com.example.factorypattern.abstractfactory;

import com.example.factorypattern.factory.Send;

//短信实现类
public class SendSmsImpl implements Send {
    @Override
    public void send() {
        System.out.println("发送短信，到SC");
    }
}
