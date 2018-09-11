package com.test.testDesignPattern.abstractFactory;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-06-21:05
 */
public class CarBenChi implements ICar {
    public void driver() {
        System.out.println("奔驰开车了");
    }

    public void fix() {
        System.out.println("奔驰修车了");
    }
}
