package com.example.strategyPattern.strategyPattern.flybehavior;

public class BadFlyBehaviorImpl implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("--BadFly--");
    }
}
