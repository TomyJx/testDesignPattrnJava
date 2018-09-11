package com.test.testDesignPattern.memento;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-13-17:45
 */
public class Person {
    private String name;
    private int age;
    private String state;

    public Person(String name, int age, String state) {
        this.name = name;
        this.age = age;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", state='" + state + '\'' +
                '}';
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
