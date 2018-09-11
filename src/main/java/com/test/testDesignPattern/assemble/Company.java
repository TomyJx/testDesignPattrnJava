package com.test.testDesignPattern.assemble;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-17-12:55
 */
public abstract class Company {
    public String name;

    public Company(String name) {
        this.name = name;
    }

    abstract void add(Company company);

    abstract boolean remove(Company company);

    abstract void Display(int depth);

    abstract void lineOfDuty();
}
