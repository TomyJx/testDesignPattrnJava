package com.test.testDesignPattern.decorate;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-21-11:17
 */
public class PersonDecorator3 extends PersonDecorator {
    public void dress() {
        super.dress();
        System.out.println("穿外套");
    }
}
