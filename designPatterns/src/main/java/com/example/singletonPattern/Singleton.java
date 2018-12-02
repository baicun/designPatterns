package com.example.singletonPattern;


public class Singleton {

    /****************************** 懒汉模式 **************************************************/
    // 私有的静态实例
    /*private static Singleton instance = null;  //懒汉模式
    // 私有构造方法
    private Singleton(){
    }
    // 静态工厂创建
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }*/
    /****************************** 饿汉模式 **************************************************/
    /*// 私有的静态实例
    private static Singleton instance = new Singleton(); //饿汉模式
    // 私有构造方法
    private Singleton() {

    }
    // 静态工厂创建
    public static Singleton getInstance() {
        return instance;
    }*/

    /****************************** 内部静态模式 **************************************************/
    /*// 私有的静态实例
    private static Singleton instance = null;
    // 内部静态代码块
    static {
        instance = new Singleton();
    }
    // 私有构造方法
    private Singleton() {

    }
    // 静态工厂创建
    public static Singleton getInstance() {
        return instance;
    }*/

    /****************************** 双重检测加锁模式 **************************************************/
    private volatile  static Singleton instance = null;//volatile 原子性,有序性,可见性
    // 私有构造方法
    private Singleton(){
    }
    // 静态工厂创建
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }



}
