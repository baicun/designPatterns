package com.example.facadePattern;

/**
 * @ClassName : MainTest
 * @Description :
 * @Version V1.0
 */
public class MainTest {

    public static  void main(String[] args){
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
    }

}
