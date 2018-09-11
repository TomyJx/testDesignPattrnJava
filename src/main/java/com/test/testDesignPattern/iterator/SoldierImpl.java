package com.test.testDesignPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-25-19:13
 */
public class SoldierImpl implements SoldierInter {

    private List<Object> objects = new ArrayList();

    public List<Object> getObjects() {
        return objects;
    }

    public SoldierIteratorInter createIterator() {
        return new SoldierIteratorImpl(this);
    }

    public int count() {
        return objects.size();
    }

    public Object currentItem(int index) {
        return objects.get(index);
    }

    public boolean add(Object o) {
        return objects.add(o);
    }
}
