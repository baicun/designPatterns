package com.example.singletonPattern;


public enum EnumSingleton {
    INSTANCE;
    public EnumSingleton getInstance(){
        return INSTANCE;
    }
    /*public void read(){
        System.out.println("read");
    }*/

}
