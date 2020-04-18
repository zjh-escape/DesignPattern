package com.zjh.singleton.type4;

/**
 * 懒汉式（线程安全，同步方法）
 * 优缺点：
 *  1. 解决了线程不安全的问题
 *  2. 效率太低，sychronized同步排队耗时
 *  3. 实际开发中不推荐使用
 */
public class SingletonTest04 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }

}

class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    // 提供一个静态共有方法，加入同步方法，解决代码安全问题。
    // 当使用到该方法的时候才去创建instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
