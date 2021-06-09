package com.example.facadePattern;

import com.example.singletonPattern.Singleton;

/**
 * @ClassName : DVDPlayer
 * @Date: DVD机
 * @Version V1.0
 */
public class DVDPlayer {
    private volatile  static DVDPlayer instance = null;//volatile 原子性,有序性,可见性
    // 私有构造方法
    private DVDPlayer(){
    }
    // 静态工厂创建
    public static DVDPlayer getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new DVDPlayer();
                }
            }
        }
        return instance;
    }
    public void on() {
        System.out.println("DVDPlayer On");
    }

    public void off() {
        System.out.println("DVDPlayer Off");
    }

    public void play() {
        System.out.println("DVDPlayer is playing");
    }

    public void pause() {
        System.out.println("DVDPlayer  pause");
    }

    public void setdvd() {
        System.out.println("DVDPlayer  is setting dvd");
    }
}
