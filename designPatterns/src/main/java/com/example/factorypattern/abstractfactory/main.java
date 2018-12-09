package com.example.factoryPattern.abstractfactory;

import com.example.factoryPattern.factory.Send;

public class main {
    // 测试
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Send mailsend = provider.produce("qq");
        mailsend.send();
    }
}
