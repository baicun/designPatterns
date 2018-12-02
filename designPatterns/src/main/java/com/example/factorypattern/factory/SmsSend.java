package com.example.factorypattern.factory;


//发送短信
public class SmsSend implements Send {
    @Override
    public void send() {
        System.out.println("发送短信成功");
    }
}
