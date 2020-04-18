package com.zjh.factory.factorymethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepared() {
        setName("伦敦奶酪pizza");
        System.out.println("伦敦奶酪pizza");
    }
}
