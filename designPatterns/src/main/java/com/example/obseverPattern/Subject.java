package com.example.obseverPattern;

/**
 * @ClassName : Subject
 * @Description : 气象站接口
 * @Version V1.0
 */
public interface Subject {
    //观察者注册
    public void  registerObserver(Observer observer);
    // 观察者移除
    public void  removeObserver(Observer observer);
    // 观察者通知
    public void  notifyObserver();
}
