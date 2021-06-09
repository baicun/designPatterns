package com.example.factoryPattern.abstractfactory;

import com.example.factoryPattern.factory.Send;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractSendMailProvider {
    Provider sendMail;
    public AbstractSendMailProvider(Provider sendMail){
        setFactory(sendMail);
    }
    // 构造工厂
    public void setFactory(Provider sendMail) {
        Send sendType = null;
        String type;
        this.sendMail = sendMail;

        do {
            type = gettype();
            sendType = sendMail.produce(type);
            if (sendType != null) {
                sendType.send();
            }

        } while (true);

    }
    //获取发送类型
    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
