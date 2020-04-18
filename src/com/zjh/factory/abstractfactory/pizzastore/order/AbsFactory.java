package com.zjh.factory.abstractfactory.pizzastore.order;

import com.zjh.factory.abstractfactory.pizzastore.pizza.Pizza;

// 是一个抽象工厂模式的抽象层（接口）
public interface AbsFactory {
    // 让工厂子类具体实现
    public Pizza createPizza(String orderType);

}
