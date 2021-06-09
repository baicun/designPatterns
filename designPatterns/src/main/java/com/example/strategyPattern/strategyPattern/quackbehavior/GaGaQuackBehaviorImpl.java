package com.example.strategyPattern.strategyPattern.quackbehavior;


public class GaGaQuackBehaviorImpl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("__GaGa__");
    }
}
