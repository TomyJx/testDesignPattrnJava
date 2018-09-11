package com.test.testDesignPattern.simpleFactory;

/**
 * 减法实现类
 *
 * @author jiyx
 * @create 2017-03-14-14:48
 */
public class ReduceOpration extends Opration {
    public double getResult() {
        return getFirstNum() - getSecondNum();
    }
}
