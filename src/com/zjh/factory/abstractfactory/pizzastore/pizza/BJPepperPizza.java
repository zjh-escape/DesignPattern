package com.zjh.factory.abstractfactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepared() {
        setName("北京胡椒pizza");
        System.out.println("北京胡椒pizza");
    }
}
