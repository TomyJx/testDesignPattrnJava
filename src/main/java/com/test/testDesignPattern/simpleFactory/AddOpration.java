package com.test.testDesignPattern.simpleFactory;

/**
 * 假发运算实现类
 *
 * @author jiyx
 * @create 2017-03-14-14:47
 */
public class AddOpration extends Opration{

    public double getResult() {
        return getFirstNum() + getSecondNum();
    }
}
