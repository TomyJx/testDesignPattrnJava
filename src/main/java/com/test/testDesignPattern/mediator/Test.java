package com.test.testDesignPattern.mediator;

/**
 * 中介者模式
 *
 * @author jiyx
 * @create 2017-05-12-12:35
 */
public class Test {

    public static void main(String[] args) {

        UnitedNations mediator = new UnitedNations();

        Country usa = new Usa(mediator);
        Country iraq = new Iraq(mediator);

        mediator.setCountry1(usa);
        mediator.setCountry2(iraq);

        usa.send("在吗");
        iraq.send("在");
        usa.send("在就发下武器");
        iraq.send("放下武器就是等死");
    }

}
