package com.test.testDesignPattern.factoryMethod;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-22-23:55
 */
public class UnderGraduateFactory implements LeiFengFactory {

    public AbstractLeiFeng getLeiFeng() {
        return new UnderGraduate();
    }
}
