package com.test.testDesignPattern.builder;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-29-21:46
 */
public class FlowPotato extends Flow {
    public FlowPotato(Food food) {
        super(food);
    }

    protected String first() {
        System.out.println("做土豆第一步");
        return null;
    }

    protected String second() {
        System.out.println("做土豆第二步");
        return null;
    }
}
