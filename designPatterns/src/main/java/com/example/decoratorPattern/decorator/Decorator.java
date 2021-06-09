package com.example.decoratorPattern.decorator;

import com.example.decoratorPattern.Drink;

/**
 * @ClassName : Decorator
 * @Description : 调料基类
 * @Version V1.0
 */
public class Decorator extends Drink {

    private Drink drink;
    public Decorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    public String getDescription()
    {
        return super.getDescription()+"&&"+drink.getDescription();
    }
}
