package com.zjh.factory.factorymethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepared() {
        setName("伦敦胡椒pizza");
        System.out.println("伦敦胡椒pizza");
    }
}
