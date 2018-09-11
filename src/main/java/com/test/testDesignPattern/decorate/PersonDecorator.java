package com.test.testDesignPattern.decorate;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-21-10:44
 */
public class PersonDecorator extends Person {
    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void dress() {
        if (person != null) {
            person.dress();
        }
    }
}
