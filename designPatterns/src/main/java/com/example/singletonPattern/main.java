package com.example.singletonPattern;

import org.springframework.util.SerializationUtils;

import java.io.Serializable;
import java.lang.reflect.Constructor;

/**
 * @ClassName : main
 * @Description :
 * @Author : baicun
 * @Date:
 * @Version V1.0
 */
public class main {


    // 枚举单例模式调用
    /*private static main instance = null;
    private main(){
    }
    public static  main getInstance(){
        if(instance == null){
            EnumSingleton.INSTANCE.read();
        }
    }*/

    //************************【反射攻击单例模式比较 -start】***************************************************************
    // 测试反射机制下的“双重检测加锁模式”
    /*public static void main(String[] args) throws Exception {
        Singleton sg1=Singleton.getInstance();
        Singleton sg2=Singleton.getInstance();
        System.out.println("正常情况下，获得的两个实例是否相同："+(sg1==sg2));
        //  获取所有构造器
        Constructor<Singleton> constructor=Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton s2=constructor.newInstance();
        System.out.println(sg1+"\n"+sg2+"\n"+s2);
        System.out.println("通过反射攻击单例模式情况下，实例化两个实例是否相同："+(sg1==s2));
        //输出结果
        //正常情况下，实例化两个实例是否相同：true
        //通过反射攻击单例模式情况下，实例化两个实例是否相同：false
    }*/

    // 测试反射机制下的“枚举单例模式”
    /*public static void main(String[] args) throws Exception{
        EnumSingleton singleton1=EnumSingleton.INSTANCE;
        EnumSingleton singleton2=EnumSingleton.INSTANCE;
        System.out.println("正常情况下，实例化两个实例是否相同："+(singleton1==singleton2));
        Constructor<EnumSingleton> constructor= null;
        constructor = EnumSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        EnumSingleton singleton3= null;
        singleton3 = constructor.newInstance();
        System.out.println(singleton1+"\n"+singleton2+"\n"+singleton3);
        System.out.println("通过反射攻击单例模式情况下，实例化两个实例是否相同："+(singleton1==singleton3));

        // 输出结果
        //正常情况下，实例化两个实例是否相同：true
        //Exception in thread "main" java.lang.NoSuchMethodException: com.example.singletonPattern.EnumSingleton.<init>()
        //会检查该类是否ENUM修饰，如果是则抛出异常，反射失败。所以枚举是不怕发射攻击的。
    }*/

    //经过比较，枚举单例模式不会受到反射攻击
    //************************【反射攻击单例模式比较 -end】***************************************************************

    //************************【反序列化攻击单例模式比较  -start】***************************************************************

    // 测试反序列化机制下的“双重检测加锁模式”
    /*public static void main(String[] args) throws Exception {
        Singleton instance=Singleton.getInstance();
        byte[] serialize = SerializationUtils.serialize(instance);
        Singleton newInstance = (Singleton) SerializationUtils.deserialize(serialize);
        System.out.println("反序列化情况下，两个实例是否相同："+(instance==newInstance));
        //输出结果
        //反序列化情况下，两个实例是否相同：false
    }*/
    // 测试反射机制下的“枚举单例模式”
    public static  void main(String[] args){
        Singleton s = new Singleton();

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        byte[] serialize = SerializationUtils.serialize(enumSingleton);
        EnumSingleton newInstance = (EnumSingleton) SerializationUtils.deserialize(serialize);
        System.out.println("反序列化情况下，两个实例是否相同："+(enumSingleton==newInstance));
        //输出结果
        // 反序列化情况下，两个实例是否相同：true
    }

    //经过比较，枚举单例模式不会受到反序列化攻击
    //************************【反序列化攻击单例模式比较  -end】***************************************************************



}
