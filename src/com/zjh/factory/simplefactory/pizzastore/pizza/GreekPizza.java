package com.zjh.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepared() {
        System.out.println("给greekPizza准备原材料");
    }
}
