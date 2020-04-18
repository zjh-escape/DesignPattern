package com.zjh.singleton.type7;

/**
 * 静态内部类实现
 *
 * 推荐使用
 */
public class SingletonTest07 {
}

// 静态内部类，推荐使用
class Singleton {
    private Singleton() {
    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
