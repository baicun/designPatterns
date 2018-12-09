package com.example.proxyPattern.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

//RMI服务注册，执行开启服务
public class Route {
    public static void main(String[] args) {
        try {
            MyRemote service=new MyRemoteSvcImpl();
            LocateRegistry.createRegistry(6600);
            //IP地址要写本机ip
            Naming.rebind("rmi://10.0.5.27:6600/RemoteHello", service);//绑定开启服务
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println( e.toString());
        }
    }
}
