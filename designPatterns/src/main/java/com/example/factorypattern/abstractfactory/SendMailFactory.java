package com.example.factoryPattern.abstractfactory;
import com.example.factoryPattern.factory.Send;

//邮件工厂类
public class SendMailFactory implements Provider {
    public Send produce(String type){
        //如果 type=qq,则发送qq邮件，否则发送126邮件
        if("qq".equals(type)){
            return new SendMailQqImpl();
        }else{
            return new SendMail126Impl();
        }
    }
}
