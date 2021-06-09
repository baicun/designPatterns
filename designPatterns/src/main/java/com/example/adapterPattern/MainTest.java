package com.example.adapterPattern;

import com.example.adapterPattern.classAdapter.TurkeyAdapterClass;
import com.example.adapterPattern.objectAdapter.GreenHeadDuck;

/**
 * @ClassName : MainTest
 * @Version V1.0
 */
public class MainTest {
    public static  void main(String[] args){
        //对象适配器
       /* GreenHeadDuck duck=new GreenHeadDuck();
        duck.quack();
        duck.fly();

        WildTurkey turkey=new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();*/

        //类适配器
        GreenHeadDuck duck=new GreenHeadDuck();
        duck.quack();
        duck.fly();

        TurkeyAdapterClass turkeyAdapterClass = new TurkeyAdapterClass();
        turkeyAdapterClass.quack();
        turkeyAdapterClass.fly();
    }
}
