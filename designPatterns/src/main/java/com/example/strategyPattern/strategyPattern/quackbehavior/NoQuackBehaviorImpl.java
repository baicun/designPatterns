package com.example.strategyPattern.strategyPattern.quackbehavior;

public class NoQuackBehaviorImpl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("__NoQuack__");
    }
}
