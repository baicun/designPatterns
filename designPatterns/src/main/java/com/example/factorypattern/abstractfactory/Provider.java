package com.example.factorypattern.abstractfactory;

import com.example.factorypattern.factory.Send;

//抽象接口
public interface Provider {
    public Send produce();
}
