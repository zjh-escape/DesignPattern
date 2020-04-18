package com.zjh.factory.abstractfactory.pizzastore.order;

import com.zjh.factory.abstractfactory.pizzastore.pizza.LDCheesePizza;
import com.zjh.factory.abstractfactory.pizzastore.pizza.LDPepperPizza;
import com.zjh.factory.abstractfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
