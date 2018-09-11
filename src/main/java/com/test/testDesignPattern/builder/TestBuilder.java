package com.test.testDesignPattern.builder;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-29-21:50
 */
public class TestBuilder {
    public static void main(String[] args) {
        Food food = new Food();
        FlowFish flowFish = new FlowFish(food);
        FlowDirector flowDirector = new FlowDirector(flowFish);
        flowDirector.getFood();

        FlowPotato flowPotato = new FlowPotato(food);
        FlowDirector flowDirector1 = new FlowDirector(flowPotato);
        flowDirector1.getFood();
    }
}
