package com.test.testDesignPattern.builder;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-29-21:48
 */
public class FlowDirector {
    private Flow flow;

    public FlowDirector(Flow flow) {
        this.flow = flow;
    }

    public void getFood(){
        flow.first();
        flow.second();
    }
}
