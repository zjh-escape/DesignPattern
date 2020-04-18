package com.zjh.singleton.type6;

/**
 * 线程安全、效率高的实现方式，推荐使用
 */
public class SingletonTest06 {

    public static void main(String[] args) {

    }

}

/**
 * 懒汉式（双重校验）
 */
class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}