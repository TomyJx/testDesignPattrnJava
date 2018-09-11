package com.test.testDesignPattern.adapter;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-11-12:39
 */
public class Forwards extends AbstractPlayer {
    public Forwards(String name) {
        super(name);
    }

    void attack() {
        System.out.println("前锋 ：" + name + " 发起了进攻");
    }

    void defense() {
        System.out.println("前锋：" + name + " 回撤防守");
    }
}
