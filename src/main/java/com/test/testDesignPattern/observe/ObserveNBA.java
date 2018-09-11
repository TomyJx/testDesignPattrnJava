package com.test.testDesignPattern.observe;

/**
 * 具体的观察者
 *
 * @author jiyx
 * @create 2017-03-31-19:35
 */
public class ObserveNBA implements Observe{

    private String name;

    private Subject subject;

    public ObserveNBA() {
    }

    public ObserveNBA(String name, Subject subject) {
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
        System.out.println("观察者" + name + "发现：" + subject.notifyContent() + "." + name + "关闭了NBA。");
    }
}
