package com.example.obseverPattern;

/**
 * @ClassName : CurrentConditions
 * @Description : 气象数据面板
 * @Version V1.0
 */
public class CurrentConditionsB implements Observer{

    private float mTemperature;
    private float mPresure;
    private float mHumidity;

    public void update(float mTemperature, float mPresure, float mHumidity){
        this.mTemperature = mTemperature;
        this.mPresure = mPresure;
        this.mHumidity = mHumidity;
        display();
    }

    public void display(){
        System.out.println("明天的温度:"+mTemperature);
        System.out.println("明天的气压:"+mPresure);
        System.out.println("明天的湿度:"+mHumidity);
    }

}
