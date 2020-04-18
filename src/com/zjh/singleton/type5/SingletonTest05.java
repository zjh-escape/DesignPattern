package com.zjh.singleton.type5;

/**
 * 懒汉式（线程安全，同步代码块）
 * 不能使用！！
 */
public class SingletonTest05 {

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
    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
