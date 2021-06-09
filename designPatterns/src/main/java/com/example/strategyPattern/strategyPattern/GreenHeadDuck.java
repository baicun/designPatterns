package com.example.strategyPattern.strategyPattern;

import com.example.strategyPattern.strategyPattern.flybehavior.GoodFlyBehaviorImpl;
import com.example.strategyPattern.strategyPattern.quackbehavior.GaGaQuackBehaviorImpl;

public class GreenHeadDuck extends Duck {
    public GreenHeadDuck() {
        mFlyBehavior = new GoodFlyBehaviorImpl();
        mQuackBehavior = new GaGaQuackBehaviorImpl();
    }

    @Override
    public void display() {
        System.out.println("**GreenHead**");
    }
}
