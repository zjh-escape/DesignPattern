package com.zjh.singleton.type8;

/**
 * 优缺点：
 * 1. 避免多线程同步问题，繁殖反序列化创建对象
 *
 * 推荐使用
 */

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance1 == instance2);
        instance1.sayOK();
    }
}

// 使用枚举，可以实现单例
enum Singleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok");
    }
}