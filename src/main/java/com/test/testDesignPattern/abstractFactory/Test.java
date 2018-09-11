package com.test.testDesignPattern.abstractFactory;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-06-12:32
 */
public class Test {
    public static void main(String[] args) {
        String name = "大神";
        IFactory factoryBenChi = new FactoryBenChi();
        ICar carBenChi = factoryBenChi.createCar();
        IPhone phoneBenChi = factoryBenChi.createPhone();
        carBenChi.driver();
        carBenChi.fix();
        phoneBenChi.call("182");
        phoneBenChi.answer("182");

        IFactory factoryDaZhong = new FactoryDaZhong();
        ICar carDaZhong = factoryDaZhong.createCar();
        IPhone phoneDaZhong = factoryDaZhong.createPhone();
        carDaZhong.driver();
        carDaZhong.fix();
        phoneDaZhong.call("182");
        phoneDaZhong.answer("182");
    }
}
