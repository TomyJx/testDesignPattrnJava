package com.test.testDesignPattern.observe;

/**
 * 观察者模式
 *
 * @author jiyx
 * @create 2017-03-31-19:07
 */
public class Test {
    public static void main(String[] args) {
//        Subject subject = new SubjectBoss();
        Subject subject = new SubjectGirlFriend();
        Observe observe1 = new ObserveNBA("小明",subject);
        Observe observe2 = new ObserveTV("嘻嘻", subject);
        subject.add(observe1);
        subject.add(observe2);
        subject.notifyObserve();

    }
}
