package com.test.testDesignPattern.prototype;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-28-12:38
 */
public class School implements Cloneable{
    private String name;
    private String address;

    public School() {
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    protected School clone() throws CloneNotSupportedException {
        return (School) super.clone();
    }
}
