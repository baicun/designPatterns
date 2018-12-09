package com.example.proxyPattern;

//测试类
public class MainTest {

    public static void main(String[] arg){
        //代理前
        DollMachine dollMachineA = new DollMachineImpl();
        String sa = dollMachineA.dollMachineState();
        System.out.println("代理前 机器抓娃娃机状态 = [" + sa + "]");
        //代理后
        DollMachine dollMachineB = new ProxyDollMachine();
        String sb = dollMachineB.dollMachineState();
        System.out.println("代理后 机器抓娃娃机状态 = [" + sb + "]");
    }
}
