package com.example.obseverPattern;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName : WeatherData
 * @Description : 气象站数据
 * @Version V1.0
 */
public class WeatherData implements Subject {
    private float mTemperature;
    private float mPresure;
    private float mHumidity;
    private ArrayList<Observer> observerArrays;

    public WeatherData(){
        observerArrays = new ArrayList<Observer>();
    }

    public float getmTemperature() {
        return mTemperature;
    }

    public void setmTemperature(float mTemperature) {
        this.mTemperature = mTemperature;
    }

    public float getmPresure() {
        return mPresure;
    }

    public void setmPresure(float mPresure) {
        this.mPresure = mPresure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void setmHumidity(float mHumidity) {
        this.mHumidity = mHumidity;
    }

    // 通知方法
    public void dataChange(){
        notifyObserver();
    }

    public void setData(float mTemperature, float mPresure, float mHumidity){
        this.mTemperature = mTemperature;
        this.mPresure = mPresure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerArrays.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observerArrays.contains(observer)){
            observerArrays.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer obs : observerArrays){
            obs.update(getmTemperature(),getmPresure(),getmHumidity());
        }
    }
}
