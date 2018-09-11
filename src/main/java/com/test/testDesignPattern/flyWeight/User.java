package com.test.testDesignPattern.flyWeight;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-16-12:43
 */
public class User {

    public User(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
