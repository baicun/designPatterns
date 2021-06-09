package com.example.decoratorPattern.coffee;

/**
 * @ClassName : Decaf
 * @Description : 无咖啡因咖啡
 * @Version V1.0
 */
public class Decaf extends Coffee{
    public Decaf(){
        super.setDescription("Decaf");
        super.setPrice(3.0f);
    }
}
