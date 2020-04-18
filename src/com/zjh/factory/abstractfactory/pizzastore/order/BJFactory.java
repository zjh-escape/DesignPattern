package com.zjh.factory.abstractfactory.pizzastore.order;

import com.zjh.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import com.zjh.factory.abstractfactory.pizzastore.pizza.BJPepperPizza;
import com.zjh.factory.abstractfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
