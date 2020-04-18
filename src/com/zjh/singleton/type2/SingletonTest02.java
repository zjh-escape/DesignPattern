package com.zjh.singleton.type2;

/**
 * 饿汉式（静态代码块）
 */
public class SingletonTest02 {
    public static void main(String[] args) {

    }
}

class Singleton {
    // 1. 构造器私有化，外部不能new
    private Singleton() {

    }

    // 2.本类内部创建对象实例
    private static Singleton instance;

    // 在静态代码块中创建单例对象
    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}