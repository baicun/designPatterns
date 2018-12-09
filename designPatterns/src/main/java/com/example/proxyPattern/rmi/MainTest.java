package com.example.proxyPattern.rmi;


public class MainTest {
    public static void main(String[] args) {
        try {
            ProxyRemote proxyRemote = new ProxyRemote();
            // 通过代理类获取代理服务端接口
            String first = proxyRemote.service.sayHello();
            String status = proxyRemote.service.dollMachineState();
            System.out.println("首次通信：" + first);
            System.out.println("返回远程机器状态：" + status);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
