package com.example.factorypattern.abstractfactory;

import com.example.factorypattern.factory.Send;
//邮件工厂类
public class SendMailFactory implements Provider{
    public Send produce(){
        return new SendMailImpl();
    }
}
