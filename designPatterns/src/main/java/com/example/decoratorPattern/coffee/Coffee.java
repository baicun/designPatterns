package com.example.decoratorPattern.coffee;

import com.example.decoratorPattern.Drink;

/**
 * @ClassName : Coffee
 * @Description : 咖啡基类
 * @Version V1.0
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
