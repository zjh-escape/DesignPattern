package com.zjh.singleton.type1;

/**
 * 饿汉式（静态变量）
 * 优点：简单，避免线程同步问题
 * 缺点：没有达到懒加载效果，可能造成内存的浪费
 *
 * 总结：单例模式可用，但可能造成内存浪费
 */
public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton{
    // 1. 构造器私有化，外部不能new
    private Singleton(){
    }

    // 2.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
