package com.example.strategyPattern.strategyPattern.flybehavior;

public class GoodFlyBehaviorImpl implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("--GoodFly--");
    }
}
