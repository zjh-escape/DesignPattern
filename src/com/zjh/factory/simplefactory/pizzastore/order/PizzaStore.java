package com.zjh.factory.simplefactory.pizzastore.order;

// 相当与一个客户端，发出订单
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();


        new OrderPizza(new SimpleFactory());
        System.out.println("exit program!");

    }
}
