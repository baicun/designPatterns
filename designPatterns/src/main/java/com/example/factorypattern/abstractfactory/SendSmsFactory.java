package com.example.factorypattern.abstractfactory;

import com.example.factorypattern.factory.Send;

//短信工厂类
public class SendSmsFactory implements Provider{
    public Send produce(){
        return new SendSmsImpl();
    }
}
