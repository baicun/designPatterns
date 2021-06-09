package com.example.obseverPattern;

/**
 * @ClassName : Observer
 * @Description : 观察者接口
 * @Version V1.0
 */
public interface Observer {
    public void update(float mTemperature, float mPresure, float mHumidity);
}
