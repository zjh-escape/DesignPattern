package com.zjh.factory.factorymethod.pizzastore.order;

import com.zjh.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.zjh.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.zjh.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
