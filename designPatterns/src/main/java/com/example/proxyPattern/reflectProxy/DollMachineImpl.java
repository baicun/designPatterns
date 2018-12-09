package com.example.proxyPattern.reflectProxy;


//接口实现类
public class DollMachineImpl implements DollMachine {

    @Override
    public int sum() throws InterruptedException {
        System.out.println("返回机器中娃娃的数量");
        Thread.sleep(5000);
        return 100;
    }

    @Override
    public String dollMachineState() throws InterruptedException {
        System.out.println("返回机器的使用状态");
        Thread.sleep(100);
        return "0";
    }
}
