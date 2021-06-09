package com.example.decoratorPattern;

import com.example.decoratorPattern.coffee.Decaf;
import com.example.decoratorPattern.coffee.Espresso;
import com.example.decoratorPattern.decorator.Milk;
import com.example.decoratorPattern.decorator.Soy;

/**
 * @ClassName : mainTest
 * @Description :
 * @Version V1.0
 */
public class MainTest {
    public static void main(String[] args){
        Drink drink;
        drink = new Decaf();
        System.out.println("描述 = [" + drink.getDescription() + "]");

        drink = new Espresso();
        drink = new Milk(drink);
        drink = new Soy(drink);
        drink = new Soy(drink);
        System.out.println("价格 = [" + drink.cost() + "]");
        System.out.println("描述 = [" + drink.getDescription() + "]");

    }
}
