package com.example.factorypattern.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//工厂类
public class SendFactory {

    public Send produce(String type) {

        if ("mail".equals(type)) {
            return new MailSend();
        } else if ("sms".equals(type)) {
            return new SmsSend();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }


    // 测试
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Send s = factory.produce(sendType());
        s.send();
    }

    //客户端输入发送类型
    private static String sendType() {
        try {
            BufferedReader write = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("请输入发送类型!:");
            String str = write.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }


}
