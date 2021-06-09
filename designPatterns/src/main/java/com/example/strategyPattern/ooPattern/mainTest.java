package com.example.strategyPattern.ooPattern;

public class mainTest {
    public static  void main(String[] args){
        GreenHeadDuck mGreenHeadDuck = new GreenHeadDuck();
        mGreenHeadDuck.display();
        mGreenHeadDuck.Quack();
        mGreenHeadDuck.swim();
        mGreenHeadDuck.Fly();

        RedHeadDuck mRedHeadDuck = new RedHeadDuck();
        mRedHeadDuck.display();
        mRedHeadDuck.Quack();
        mRedHeadDuck.swim();
        mRedHeadDuck.Fly();
    }
}
