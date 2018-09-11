package com.test.testDesignPattern.mediator;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-12-12:37
 */
public abstract class Country {
    protected Mediator mediator;

    public Country(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);

    public abstract void getMessage(String message);
}
