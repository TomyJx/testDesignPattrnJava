package com.test.testDesignPattern.abstractFactory;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-06-21:08
 */
public class FactoryDaZhong implements IFactory {
    public IPhone createPhone() {
        return new PhoneNokia("大神");
    }

    public ICar createCar() {
        return new CarDaZhong();
    }
}
