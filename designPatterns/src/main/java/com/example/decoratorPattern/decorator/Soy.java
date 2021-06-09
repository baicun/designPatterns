package com.example.decoratorPattern.decorator;

import com.example.decoratorPattern.Drink;

/**
 * @ClassName : Soy
 * @Description : 豆浆
 * @Version V1.0
 */
public class Soy extends Decorator{
    public Soy(Drink drink) {
        super(drink);
        super.setDescription("Soy");
        super.setPrice(1.5f);
    }
}
