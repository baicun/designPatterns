package com.example.TemplatePattern;

/**
 * @ClassName : Tea
 * @Description :
 * @Author : baicun
 * @Date:
 * @Version V1.0
 */
public class Tea extends HotDrink {
    @Override
    public void brew() {
        System.out.println("brew tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("addCondiments sugar");
    }
}
