package com.zjh.singleton.type3;

/**
 * 懒汉式（线程不安全）
 * 优缺点：
 *  1. 起到了懒加载效果，只能在单线程下使用
 *  2. 在多线程下，可能存在产生多个实例的风险
 *  3. 结论：不能用
 */
public class SingletonTest03 {

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

    // 提供一个静态共有方法，当使用到该方法的时候才去创建instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
