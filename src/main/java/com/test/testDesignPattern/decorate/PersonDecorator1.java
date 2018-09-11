package com.test.testDesignPattern.decorate;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-21-11:15
 */
public class PersonDecorator1 extends PersonDecorator{
    public void dress() {
        super.dress();
        System.out.println("穿背心");
    }
}
