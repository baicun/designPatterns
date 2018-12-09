package com.example.proxyPattern;

import org.springframework.stereotype.Service;

//抓娃娃机器
@Service
public class DollMachineImpl implements DollMachine{
    @Override
    public String dollMachineState() {
        System.out.println("正在获取机器状态，请等待...");
        return "0";
    }
}
