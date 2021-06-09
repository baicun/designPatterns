package com.example.obseverPattern;
/**
 * @ClassName : mainTest
 * @Description :
 * @Author : baicun
 * @Date:
 * @Version V1.0
 */
public class mainTest {
    public static  void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsA currentConditionsA = new CurrentConditionsA();
        CurrentConditionsB currentConditionsB = new CurrentConditionsB();
        weatherData.registerObserver(currentConditionsA);
        weatherData.registerObserver(currentConditionsB);

        weatherData.setData(30,150,60);

        weatherData.removeObserver(currentConditionsA);
        weatherData.setData(90,350,70);
    }
}
