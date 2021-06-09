package com.example.TemplatePattern;

/**
 * @ClassName : HotDrinkTemplate
 * @Description :
 * @Author : baicun
 * @Date:
 * @Version V1.0
 */
public abstract class HotDrinkTemplate {
    //模板核心算法
    public final void prepareRecipe(){
        //烧水
        boilWater();
        //煮
        brew();
        //倒杯子
        pourInCup();
        //加调料
        addCondiments();
        if(wantConditionHook()){
            addCondiments();
        }else{
            System.out.println("no addCondiments");
        }
    }

    public boolean wantConditionHook(){
        return true;
    }
    //final 子类不可实现
    public final  void boilWater(){
        System.out.println("boilWater");
    }
    //abstract 子类必须实现
    public abstract void brew();

    public final void pourInCup(){
        System.out.println("pourInCup");
    }
    public abstract void addCondiments();
}
