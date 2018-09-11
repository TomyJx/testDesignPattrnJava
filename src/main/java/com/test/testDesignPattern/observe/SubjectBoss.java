package com.test.testDesignPattern.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的通知者
 *
 * @author jiyx
 * @create 2017-03-31-19:40
 */
public class SubjectBoss implements Subject {

    private List<Observe> list = new ArrayList<Observe>();

    public void add(Observe observe) {
        list.add(observe);
    }

    public boolean remove(Observe observe) {
        return list.remove(observe);
    }

    public void notifyObserve() {
        for (int l = 0; l < list.size(); l++) {
            Observe observe = list.get(l);
            observe.update();
        }

    }

    public String notifyContent() {
        return "老板我回来了";
    }
}
