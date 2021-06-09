package com.example.strategyPattern.strategyPattern;

import com.example.strategyPattern.strategyPattern.flybehavior.BadFlyBehaviorImpl;
import com.example.strategyPattern.strategyPattern.quackbehavior.GeGeQuackBehaviorImpl;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        mFlyBehavior = new BadFlyBehaviorImpl();
        mQuackBehavior = new GeGeQuackBehaviorImpl();
    }

    @Override
    public void display() {
        System.out.println("**RedHead**");
    }
}
