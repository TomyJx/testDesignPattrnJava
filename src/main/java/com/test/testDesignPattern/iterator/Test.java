package com.test.testDesignPattern.iterator;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-25-19:06
 */
public class Test {
    public static void main(String[] args) {
        SoldierImpl soldier = new SoldierImpl();
        soldier.add("1111");
        soldier.add(new Object());
        soldier.add(22);
        soldier.add(32.23f);
        soldier.add("12323");
        SoldierIteratorInter iterator = soldier.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
