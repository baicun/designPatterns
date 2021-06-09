package com.example.TemplatePattern;

/**
 * @ClassName : Coffee
 * @Version V1.0
 */
public class Coffee extends HotDrink{

    @Override
    public void brew() {
        System.out.println("brew coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("addCondiments milk");
    }
}
