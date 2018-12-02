package com.example.factorypattern.simplefactory;

import com.example.factorypattern.factory.MailSend;
import com.example.factorypattern.factory.Send;
import com.example.factorypattern.factory.SmsSend;
//简单工厂类
public class SimpleFactory {
    //发送邮件
    public Send proceMail(){
        return new MailSend();
    }
    //发送短信
    public Send proceSms(){
        return new SmsSend();
    }

    // 测试
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Send send = factory.proceMail();
        send.send();
    }

}
