package com.zjh.factory.simplefactory.pizzastore.pizza;

// 抽象类
public abstract class Pizza {

    protected String name;

    public abstract void prepared();

    public void bake() {
        System.out.println(name + "baking");
    }

    public void cut() {
        System.out.println(name + "cutting");
    }

    public void box() {
        System.out.println(name + "boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
