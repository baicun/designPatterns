package com.example.proxyPattern.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName : DollMachineProxy
 * @Description :
 */
public class DollMachineProxy implements org.springframework.cglib.proxy.MethodInterceptor {
    private Object target;
    public DollMachineProxy(Object target) {
        this.target = target;
    }
    // 返回一个代理对象:  是 target 对象的代理对象
    // 根据一个类型产生代理类，此方法不要求一定放在MethodInterceptor中
    public Object getProxyInstance() {
        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback((Callback) this);
        //4. 创建子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        long start = System.currentTimeMillis();
        Object returnVal = method.invoke(target,objects);
        long end = System.currentTimeMillis();
        System.out.println("代理调用耗时：" + (end - start));
        return returnVal;
    }
}
