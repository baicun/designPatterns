package com.example.factorypattern.abstractfactory;

import com.example.factorypattern.factory.Send;

public class main {
    // 测试
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Send mailsend = provider.produce();
        mailsend.send();
    }
}
