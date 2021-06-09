package com.example.adapterPattern.classAdapter;

import com.example.adapterPattern.objectAdapter.Duck;
import com.example.adapterPattern.objectAdapter.WildTurkey;

/**
 * @ClassName : TurkeyAdapterClass
 * @Version V1.0
 */
public class TurkeyAdapterClass extends WildTurkey implements Duck {

    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        super.fly();
        super.fly();
        super.fly();
    }
}
