package com.example.decoratorPattern.decorator;

import com.example.decoratorPattern.Drink;

/**
 * @ClassName : Milk
 * @Description : 牛奶
 * @Version V1.0
 */
public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        super.setDescription("Milk");
        super.setPrice(2.0f);
    }
}
