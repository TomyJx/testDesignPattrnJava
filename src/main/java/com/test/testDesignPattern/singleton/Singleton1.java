package com.test.testDesignPattern.singleton;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-28-12:13
 */
public class Singleton1 implements java.io.Serializable {

    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return singleton1;
    }

    // 这里因为实现了序列化接口所以必须加上这个方法,否则可以反序列话多次，就会破坏单例
    public Object readResolve() {
        return singleton1;
    }
}
