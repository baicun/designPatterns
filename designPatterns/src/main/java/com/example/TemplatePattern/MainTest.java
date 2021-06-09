package com.example.TemplatePattern;

/**
 * @ClassName : MainTest
 * @Description :
 * @Author : baicun
 * @Date:
 * @Version V1.0
 */
public class MainTest {
    public static  void main(String[] args){
        HotDrink coffee = new Coffee();
        coffee.prepareRecipe();

        HotDrink tea = new Tea();
        tea.prepareRecipe();

        //hook测试
        HotDrinkTemplate teaHook = new TeaHook();
        teaHook.prepareRecipe();
    }
}
