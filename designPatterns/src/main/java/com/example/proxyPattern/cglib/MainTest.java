package com.example.proxyPattern.cglib;

public class MainTest {
    public static void main(String[] arg) throws InterruptedException {
        //获取代理对象，并强转成被代理对象的数据类型
        DollMachine proxyInstance = (DollMachine) new DollMachineProxy(new DollMachine()).getProxyInstance();
        //执行代理对象的方法，触发intecept 方法，从而实现 对目标对象的调用
        proxyInstance.dollMachineState();
    }
}
