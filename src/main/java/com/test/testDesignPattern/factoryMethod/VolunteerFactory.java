package com.test.testDesignPattern.factoryMethod;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-22-23:56
 */
public class VolunteerFactory implements LeiFengFactory {
    public AbstractLeiFeng getLeiFeng() {
        return new Volunteer();
    }
}
