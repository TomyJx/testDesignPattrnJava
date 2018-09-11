package com.test.testDesignPattern.adapter;

/**
 * 适配器模式
 *
 * @author jiyx
 * @create 2017-04-11-12:32
 */
public class Test {
    public static void main(String[] args) {
        AbstractPlayer forwards = new Forwards("细小");
        forwards.attack();
        forwards.defense();
        AbstractPlayer center = new Center("是的");
        center.attack();
        center.defense();
        AbstractPlayer guards = new Guards("试试");
        guards.attack();
        guards.defense();
        AbstractPlayer a = new Adapter("速速速");
        a.attack();
        a.defense();
    }
}
