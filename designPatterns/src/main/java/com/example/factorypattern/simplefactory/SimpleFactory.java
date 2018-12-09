package com.example.factoryPattern.simplefactory;

import com.example.factoryPattern.factory.MailSend;
import com.example.factoryPattern.factory.Send;
import com.example.factoryPattern.factory.SmsSend;
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
