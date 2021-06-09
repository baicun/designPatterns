package com.example.factoryPattern.abstractfactory;

public class mainTest {
    // 测试
    public static void main(String[] args) {
        // AbstractSendMailProvider abstractSendMailProvider;
        // abstractSendMailProvider = new AbstractSendMailProvider(new SendMailFactory());

        AbstractSendSmsProvider abstractSendSmsProvider;
        abstractSendSmsProvider = new AbstractSendSmsProvider(new SendSmsFactory());
    }
}
