package com.example.strategyPattern.strategyPattern;

import com.example.strategyPattern.strategyPattern.flybehavior.NoFlyBehaviorImpl;

public class mainTest {
    public static  void main(String[] args){
        Duck greenDuck = new GreenHeadDuck();
        greenDuck.display();
        greenDuck.Fly();
        greenDuck.Quack();
        greenDuck.swim();

        Duck redDuck = new RedHeadDuck();
        redDuck.display();
        redDuck.Fly();
        redDuck.Quack();
        redDuck.swim();
        redDuck.SetFlyBehavoir(new NoFlyBehaviorImpl());//行为对象
        redDuck.Fly();
    }


}
