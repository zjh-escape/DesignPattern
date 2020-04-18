package com.zjh.factory.factorymethod.pizzastore.order;


import com.zjh.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    // 定义一个抽象方法，createPizza，让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;//订购披萨的类型
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            // 输出信息：pizza制作过程
            pizza.prepared();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }


    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza种类");
            String s = bufferedReader.readLine();
            return s;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

}
