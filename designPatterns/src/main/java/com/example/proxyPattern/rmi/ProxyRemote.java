package com.example.proxyPattern.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ProxyRemote {
    // 代理服务端接口
    MyRemote service;
    public ProxyRemote() throws RemoteException, MalformedURLException, NotBoundException {
        //通过Naming.lookup方法解析ip 查找注册地址，返回
        service = (MyRemote) Naming.lookup("rmi://127.0.0.1:6600/RemoteHello");
    }

}
