package com.test.testDesignPattern.State;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-08-14:20
 */
public class ContextDress {
    private DressState currentState;

    private int month = 1;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public ContextDress() {
        this.currentState = new DressStateSpring();
    }

    public DressState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(DressState currentState) {
        this.currentState = currentState;
    }

    public void dress() {
        currentState.dress(this);
    }
}
