package com.zjh.factory.abstractfactory.pizzastore.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepared() {
        setName("北京奶酪pizza");
        System.out.println("北京奶酪pizza");
    }
}
