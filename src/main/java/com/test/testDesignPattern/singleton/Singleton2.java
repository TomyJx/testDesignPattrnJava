package com.test.testDesignPattern.singleton;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-28-12:15
 */
public class Singleton2 {
    private Singleton2() {

    }
    public static class Singleton{
        public static final Singleton2 SINGLETON = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return Singleton.SINGLETON;
    }
}
