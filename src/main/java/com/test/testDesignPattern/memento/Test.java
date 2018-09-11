package com.test.testDesignPattern.memento;

import com.test.testDesignPattern.decorate.*;

/**
 * 备忘录：目前理解主要是为了保存某些状态，然后更新目前的状态，如果对目前的状态不满意就可以回退到更新前的状态
 *
 * @author jiyx
 * @create 2017-04-13-17:41
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("武松");
        person.setAge(23);
        person.setState("喝完酒后意气风发");
        System.out.println(person.toString());
        // 武松觉得自己状态不错 存个档
        MementoManager manager = new MementoManager(new MementoPerson(person.getState(),person.getAge()));

        // 上的景阳冈 景色不错 心旷神怡 存个档
        person.setAge(23);
        person.setState("欣赏美景心旷神怡");
        System.out.println(person.toString());

        manager.setMementoPerson1(new MementoPerson(person.getState(),person.getAge()));

        person.setState("打老虎，断臂");
        System.out.println(person.toString());

        MementoPerson mementoPerson1 = manager.getMementoPerson1();
        person.setState(mementoPerson1.getState());
        System.out.println(person.toString());

        MementoPerson mementoPerson = manager.getMementoPerson();
        person.setState(mementoPerson.getState());
        System.out.println(person.toString());
    }
}
