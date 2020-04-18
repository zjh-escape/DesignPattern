package com.zjh.factory.simplefactory.pizzastore.order;

import com.zjh.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.zjh.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.zjh.factory.simplefactory.pizzastore.pizza.Pizza;

public class SimpleFactory {

    // 根据orderType返回对应的pizza对象
    public Pizza createPizza(String orderType){

        Pizza pizza = null;

        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }

        return pizza;
    }

}
