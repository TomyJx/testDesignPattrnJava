package com.test.testDesignPattern.mediator;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-12-12:40
 */
public class UnitedNations extends Mediator {

    private Country country1;

    private Country country2;

    public void setCountry1(Country country1) {
        this.country1 = country1;
    }

    public void setCountry2(Country country2) {
        this.country2 = country2;
    }

    public void sendMessage(String message, Country country) {
        if (country == country1) {
            country2.getMessage(message);
        } else {
            country1.getMessage(message);
        }
    }
}
