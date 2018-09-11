package com.test.testDesignPattern.observe;

/**
 * 具体的观察者
 *
 * @author jiyx
 * @create 2017-03-31-19:39
 */
public class ObserveTV implements Observe {

    private String name;

    private Subject subject;

    public ObserveTV() {
    }

    public ObserveTV(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void update() {
        System.out.println("观察者" + name + "：" + subject.notifyContent() + "." + name + "关闭了TV。");
    }
}
