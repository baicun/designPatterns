package com.example.factoryPattern.abstractfactory;

import com.example.factoryPattern.factory.Send;

//短信工厂类
public class SendSmsFactory implements Provider{

    @Override
    public Send produce(String type) {
        return new SendSmsImpl();
    }
}
