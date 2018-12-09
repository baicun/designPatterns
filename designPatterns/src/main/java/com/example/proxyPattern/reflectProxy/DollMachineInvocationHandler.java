package com.example.proxyPattern.reflectProxy;

import java.lang.reflect.InvocationHandler;

import java.lang.reflect.Method;

// 调用处理器，当代理对象调用代理方法的时候，注册在调用处理器中的invoke方法会自动调用。
// 该接口作为代理实例的调用处理者的公共父类，
public class DollMachineInvocationHandler implements InvocationHandler {

    //注册目标对象，该目标对象的方法执行invoke()方法
    private Object target;

    //构造方法
    public DollMachineInvocationHandler(Object target) {
        this.target = target;
    }

    // 方法说明
    // Object proxy：代理对象的引用，proxy变量中保存代理对象的内存地址（这个参数很少用）
    // Method method：目标对象的目标方法。
    // Object[] args：目标对象的目标方法执行的时候所需要实参。
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        //执行目标对象中的方法
        Object retValue = null;
        // 保护代理思想，针对不同的方法，不同的角色执行权限不同。
        // 当然也可以重新写一个 InvocationHandler 来区分不同的执行权限
        if(method.getName().equals("dollMachineState")){
            return null;
        }else{
            retValue = method.invoke(target, args);
        }
        long end = System.currentTimeMillis();
        System.out.println("代理调用耗时：" + (end - start));
        return retValue;
    }
}
