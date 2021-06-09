package com.example.strategyPattern.strategyPattern;

import com.example.strategyPattern.strategyPattern.flybehavior.FlyBehavior;
import com.example.strategyPattern.strategyPattern.quackbehavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior mFlyBehavior;
    QuackBehavior mQuackBehavior;

    public Duck()  {
    }

    public void Fly() {
        mFlyBehavior.fly();
    }

    public void Quack() {
        mQuackBehavior.quack();
    }

    public abstract void display();

    public void SetQuackBehavoir(QuackBehavior qb) {
        mQuackBehavior = qb;
    }

    public void SetFlyBehavoir(FlyBehavior fb) {
        mFlyBehavior = fb;
    }

    public void swim() {
        System.out.println("~~im swim~~");
    }
}
