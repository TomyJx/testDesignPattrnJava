package com.test.testDesignPattern.adapter;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-11-12:40
 */
public class Center extends AbstractPlayer {
    public Center(String name) {
        super(name);
    }

    void attack() {
        System.out.println("中锋 ：" + name + " 发起了进攻");
    }

    void defense() {
        System.out.println("中锋：" + name + " 回撤防守");
    }
}
