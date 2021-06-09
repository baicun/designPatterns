package com.example.strategyPattern.strategyPattern.flybehavior;

public class NoFlyBehaviorImpl implements  FlyBehavior {
    @Override
    public void fly() {
        System.out.println("--NoFly--");
    }
}
