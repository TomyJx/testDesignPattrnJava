package com.test.testDesignPattern.iterator;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-25-19:11
 */
public interface SoldierIteratorInter {
    Object first();

    Object next();

    boolean hasNext();

    Object currentItem();
}
