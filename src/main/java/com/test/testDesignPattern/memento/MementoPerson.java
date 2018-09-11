package com.test.testDesignPattern.memento;

/**
 * 存储人生进度，可以回退到年轻时
 * 值存年龄和状态
 *
 * @author jiyx
 * @create 2017-04-13-18:01
 */
public class MementoPerson {
    private String state;
    private int age;

    public MementoPerson(String state, int age) {
        this.state = state;
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
