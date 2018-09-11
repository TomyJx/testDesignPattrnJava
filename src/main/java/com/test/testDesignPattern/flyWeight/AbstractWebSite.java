package com.test.testDesignPattern.flyWeight;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-16-12:42
 */
public abstract class AbstractWebSite {
    protected String name;

    public AbstractWebSite(String name) {
        this.name = name;
    }

    public abstract void use(User user);
}
