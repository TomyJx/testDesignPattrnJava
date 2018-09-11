package com.test.testDesignPattern.decorate;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-21-11:16
 */
public class PersonDecorator2 extends PersonDecorator {
    public void dress() {
        super.dress();
        System.out.println("穿裤子");
    }
}
