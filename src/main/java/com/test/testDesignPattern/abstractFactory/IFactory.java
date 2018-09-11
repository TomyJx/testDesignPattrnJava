package com.test.testDesignPattern.abstractFactory;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-06-20:59
 */
public interface IFactory {
    IPhone createPhone();

    ICar createCar();
}
