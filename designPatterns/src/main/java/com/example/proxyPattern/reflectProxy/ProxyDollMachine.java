package com.example.proxyPattern.reflectProxy;
// 代理接口的实现类对象
// JDK内置的动态代理Proxy只能代理接口
public class ProxyDollMachine implements DollMachine {

    private DollMachineImpl dollMachine;

    public ProxyDollMachine(){
        this.dollMachine=new DollMachineImpl();
    }

    @Override
    public int sum() throws InterruptedException {
        long start = System.currentTimeMillis();
        int sum = dollMachine.sum();
        long end = System.currentTimeMillis();
        System.out.println("调用耗时："+(end-start));
        return sum;
    }

    @Override
    public String dollMachineState() throws InterruptedException {
        long start = System.currentTimeMillis();
        String machineState = dollMachine.dollMachineState();
        long end = System.currentTimeMillis();
        System.out.println("调用耗时："+(end-start));
        return machineState;
    }
}
