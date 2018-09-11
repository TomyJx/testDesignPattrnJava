package com.test.testDesignPattern.prototype.copy;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-24-12:18
 */
public class Depart implements Cloneable{
    private String name;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Depart clone() throws CloneNotSupportedException {
        return (Depart)super.clone();
    }
}
