package com.test.testDesignPattern.decorate;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-21-11:18
 */
public class TestDecorate {
    public static void main(String[] args) {
        Person person = new Person();
        PersonDecorator1 p1 = new PersonDecorator1();
        PersonDecorator2 p2 = new PersonDecorator2();
        PersonDecorator3 p3 = new PersonDecorator3();
        p1.setPerson(person);
        p2.setPerson(p1);
        p3.setPerson(p2);
        p3.dress();

        System.out.println((Integer)128==(Integer)128);
    }
}
