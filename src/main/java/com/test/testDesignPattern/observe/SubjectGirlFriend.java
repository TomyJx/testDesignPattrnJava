package com.test.testDesignPattern.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的通知者
 *
 * @author jiyx
 * @create 2017-03-31-19:52
 */
public class SubjectGirlFriend implements Subject {
    private List<Observe> list = new ArrayList<Observe>();

    public void add(Observe observe) {
        list.add(observe);
    }

    public boolean remove(Observe observe) {
        return list.remove(observe);
    }

    public void notifyObserve() {
        for (int i = 0; i < list.size(); i++) {
            Observe observe = list.get(i);
            observe.update();
        }
    }

    public String notifyContent() {
        return "我爸爸回来了";
    }
}
