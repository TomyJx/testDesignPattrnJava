package com.test.testDesignPattern.adapter;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-11-12:41
 */
public class Guards extends AbstractPlayer {
    public Guards(String name) {
        super(name);
    }

    void attack() {
        System.out.println("后卫 ：" + name + " 发起了进攻");
    }

    void defense() {
        System.out.println("后卫：" + name + " 回撤防守");
    }
}
