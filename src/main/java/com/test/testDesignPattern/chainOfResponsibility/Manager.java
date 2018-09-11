package com.test.testDesignPattern.chainOfResponsibility;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-09-22:53
 */
public abstract class Manager {
    protected String name;
    protected Manager superManager;
    public Manager(String name) {
        this.name = name;
    }

    public void setSuperManager(Manager superManager) {
        this.superManager = superManager;
    }

    public abstract void approve(Request request);
}
