package com.example.adapterPattern.objectAdapter;

/**
 * @ClassName : TurkeyAdapter
 * @Description : 火鸡转鸭子适配器
 * @Version V1.0
 */
public class TurkeyAdapter implements Duck{
    private Turkey turkey;
    public TurkeyAdapter(Turkey turkey)
    {
        this.turkey=turkey;
    }
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0;i<6;i++)
        {
            turkey.fly();
        }
    }
}
