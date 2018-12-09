package com.example.proxyPattern;

import org.springframework.stereotype.Service;

//代理接口指向的实现类对象
@Service
public class ProxyDollMachine implements DollMachine{

    //目标对象
    private DollMachineImpl dollMachineA;

    //构造函数
    public ProxyDollMachine(){
        super();
        this.dollMachineA = new DollMachineImpl();
    }

    //代理方法执行
    @Override
    public String dollMachineState() {
        before();
        String ret = dollMachineA.dollMachineState();
        after();
        return ret;
    }

    public void before(){
        System.out.println("代理对象开始");
    }
    public void after(){
        System.out.println("代理对象结束");
    }

}
