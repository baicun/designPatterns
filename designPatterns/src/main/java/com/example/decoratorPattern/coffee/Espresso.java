package com.example.decoratorPattern.coffee;

/**
 * @ClassName : Espresso
 * @Description :espresso
 * @Version V1.0
 */
public class Espresso extends Coffee{
    public Espresso(){
        super.setDescription("Espresso");
        super.setPrice(4.0f);
    }
}
