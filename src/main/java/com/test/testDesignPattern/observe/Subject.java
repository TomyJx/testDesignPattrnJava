package com.test.testDesignPattern.observe;

/**
 * 通知者顶级接口
 *
 * @author jiyx
 * @create 2017-03-31-19:32
 */
public interface Subject {
    void add(Observe observe);

    boolean remove(Observe observe);

    void notifyObserve();

    String notifyContent();
}
