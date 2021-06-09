package com.example.decoratorPattern;

/**
 * @ClassName : Drink
 * @Description : 饮品超类
 * @Version V1.0
 */
public abstract class Drink {

    public String description="";
    private float price=0f;

    // cost方法是给装饰者提供拓展方法
    public abstract float cost();
    public void setDescription(String description)
    {
        this.description=description;
    }

    public String getDescription()
    {
        return description+"-"+this.getPrice();
    }

    public float getPrice()
    {
        return price;
    }
    public void setPrice(float price)
    {
        this.price=price;
    }
}
