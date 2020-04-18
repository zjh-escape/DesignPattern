package com.zjh.factory.simplefactory.pizzastore.order;

import com.zjh.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.zjh.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.zjh.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {

    SimpleFactory simpleFactory;
    Pizza pizza = null;

    // 构造器
//    public OrderPizza(){
//        Pizza pizza = null;
//        String orderType;//订购披萨的类型
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            }else if (orderType.equals("cheese")){
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            }else {
//                break;
//            }
//            // 输出信息：pizza制作过程
//            pizza.prepared();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }
    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }


    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType = "";
        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            //输出pizza信息
            if (pizza!=null){
                pizza.prepared();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购pizza失败");
                break;
            }
        }while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza种类");
            String s = bufferedReader.readLine();
            return s;
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }
}
