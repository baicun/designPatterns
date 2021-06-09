package com.example.strategyPattern.ooPattern;

public abstract class Duck {

    public Duck() {
    }

    public abstract void display();

    public void Quack() {
        System.out.println("~~gaga~~");
    }

    public void swim() {
        System.out.println("~~im swim~~");
    }
    // 后期增加一个飞的功能
    public void Fly() {
        System.out.println("~~im fly~~");
    }

}
