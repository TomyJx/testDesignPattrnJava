package com.test.testDesignPattern.builder;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-29-21:06
 */
public class FlowFish extends Flow {

    public FlowFish(Food food) {
        super(food);
    }

    protected String first() {
        System.out.println("做鱼第一步");
        return null;
    }

    protected String second() {
        System.out.println("做鱼第二步");
        return null;
    }
}
