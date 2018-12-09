package com.example.proxyPattern.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

//服务端接口:想要实现服务端的方法接口
public interface MyRemote extends Remote {
    // 客户端和服务端首次通信
    String sayHello() throws RemoteException;
    // 查看机器状态
    String dollMachineState() throws RemoteException;
}
