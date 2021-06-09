package com.example.TemplatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName : TeaHook
 * @Version V1.0
 */
public class TeaHook extends HotDrinkTemplate{
    @Override
    public void brew() {
        System.out.println("brew tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("addCondiments sugar");
    }

    @Override
    public boolean wantConditionHook() {
        System.out.println("Condiments,yes or no? please input(y/n):");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String result = null;
        try {
            result = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(result.equals("n")){
            return false;
        }else{
            return true;
        }
    }
}
