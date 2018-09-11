package com.test.testDesignPattern.prototype.copy;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-24-12:18
 */
public class Employee implements Cloneable {

    private String name;
    private int age;
    private Depart depart;

    public Depart getDepart() {
        return depart;
    }

    public void setDepart(Depart depart) {
        this.depart = depart;
    }

    public Employee(String name, int age, Depart depart) {
        this.name = name;
        this.age = age;
        this.depart = depart;
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

    // 浅拷贝
    /*@Override
    protected Employee clone() throws CloneNotSupportedException {
        return (Employee)super.clone();
    }*/

    // 深拷贝
    @Override
    protected Employee clone() throws CloneNotSupportedException {
        Employee employee = null;
        employee = (Employee) super.clone();
        employee.setDepart(depart.clone());
        return employee;
    }
}
