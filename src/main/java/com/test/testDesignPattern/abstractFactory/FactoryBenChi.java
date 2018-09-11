package com.test.testDesignPattern.abstractFactory;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-06-21:07
 */
public class FactoryBenChi implements IFactory {
    public IPhone createPhone() {
        return new PhoneHuaWei("大牛");
    }

    public ICar createCar() {
        return new CarBenChi();
    }
}
