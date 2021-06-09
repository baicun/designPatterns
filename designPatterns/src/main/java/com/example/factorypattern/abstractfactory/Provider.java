package com.example.factoryPattern.abstractfactory;

import com.example.factoryPattern.factory.Send;
//抽象接口
public interface Provider {
    public Send produce(String type);//发送类型
}
