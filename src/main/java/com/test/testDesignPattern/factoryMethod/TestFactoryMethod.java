package com.test.testDesignPattern.factoryMethod;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-22-23:56
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
//        LeiFengFactory factory = new VolunteerFactory();
        LeiFengFactory factory = new UnderGraduateFactory();
        AbstractLeiFeng leiFeng = factory.getLeiFeng();
        leiFeng.sweep();
    }
}
