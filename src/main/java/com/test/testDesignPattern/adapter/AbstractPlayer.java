package com.test.testDesignPattern.adapter;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-11-12:35
 */
public abstract class AbstractPlayer {
    protected String name;

    public AbstractPlayer(String name) {
        this.name = name;
    }

    abstract void attack();
    abstract void defense();
}
