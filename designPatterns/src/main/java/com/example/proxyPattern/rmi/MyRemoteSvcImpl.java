package com.example.proxyPattern.rmi;

import org.springframework.stereotype.Service;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//服务端方法
public class MyRemoteSvcImpl extends UnicastRemoteObject implements MyRemote {
    //构造方法
    protected MyRemoteSvcImpl() throws RemoteException {
        super();
    }
    //客户端和服务端首次通信
    @Override
    public String sayHello() throws RemoteException{
        return "Hello World!";
    }

    //返回抓娃娃机器的状态
    @Override
    public String dollMachineState() throws RemoteException {
        return "1";
    }

}
