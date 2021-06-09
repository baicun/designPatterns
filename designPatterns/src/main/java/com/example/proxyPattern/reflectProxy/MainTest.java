package com.example.proxyPattern.reflectProxy;

import java.lang.reflect.Proxy;
import java.math.BigDecimal;

public class MainTest {
    // JDK内置的动态代理Proxy只能代理接口
    //（如果既想代理接口又想代理抽象类需要使用第三方组件：例如 cglib）
    public static void main(String[] arg) throws InterruptedException {
        DollMachine target = new ProxyDollMachine();
        // 创建动态代理类和实例对象的方法
        /**
         * 第一个参数loader表示代理类的类加载器，
         * 第二个参数interfaces表示代理类所实现的接口列表（与真实主题类的接口列表一致），
         * 第三个参数h表示所指派的调用处理程序类。
         */
        DollMachine proxy = (DollMachine) Proxy.newProxyInstance(
                target.getClass().getClassLoader()
                ,new Class[]{DollMachine.class}
                ,new DollMachineInvocationHandler(target));

        // 调用方法
        proxy.sum();
        proxy.dollMachineState();
    }
}
