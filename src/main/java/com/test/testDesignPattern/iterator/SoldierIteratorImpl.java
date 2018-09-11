package com.test.testDesignPattern.iterator;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-25-19:14
 */
public class SoldierIteratorImpl implements SoldierIteratorInter {
    private SoldierImpl soldier;

    private int count = 0;

    public SoldierIteratorImpl(SoldierImpl soldier) {
        this.soldier = soldier;
    }

    public Object first() {
        return soldier.currentItem(0);
    }

    public Object next() {
        if (count < soldier.getObjects().size()) {
            return soldier.currentItem(count++);
        }
        return null;
    }

    public boolean hasNext() {
        return count < soldier.count();
    }

    public Object currentItem() {
        return soldier.currentItem(count);
    }

    public void rest() {
        count = 0;
    }
}
