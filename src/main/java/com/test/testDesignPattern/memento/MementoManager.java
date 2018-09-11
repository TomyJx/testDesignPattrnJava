package com.test.testDesignPattern.memento;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-13-18:04
 */
public class MementoManager {
    // 存档一
    private MementoPerson mementoPerson;

    // 存档二
    private MementoPerson mementoPerson1;

    public MementoPerson getMementoPerson1() {
        return mementoPerson1;
    }

    public void setMementoPerson1(MementoPerson mementoPerson1) {
        this.mementoPerson1 = mementoPerson1;
    }

    public MementoManager(MementoPerson mementoPerson) {
        this.mementoPerson = mementoPerson;
    }

    public MementoPerson getMementoPerson() {
        return mementoPerson;
    }

    public void setMementoPerson(MementoPerson mementoPerson) {
        this.mementoPerson = mementoPerson;
    }
}
