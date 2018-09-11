package com.test.testDesignPattern.builder;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-28-17:51
 */
public abstract class Flow {

    private Food food;

    // 如果抽象类中写了构造函数，那么子类实现的时候也必须一样有类似的构造函数，并不是说就可以new 抽象类了。
    public Flow(Food food) {
        this.food = food;
    }

    protected abstract String first();

    protected abstract String second();
}
