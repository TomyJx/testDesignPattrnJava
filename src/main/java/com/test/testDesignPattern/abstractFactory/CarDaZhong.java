package com.test.testDesignPattern.abstractFactory;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-06-21:03
 */
public class CarDaZhong implements ICar {
    public void driver() {
        System.out.println("大众车开车了");
    }

    public void fix() {
        System.out.println("大众车修车了");
    }
}
