package com.test.testDesignPattern.simpleFactory;

/**
 * 乘法运算实现类
 *
 * @author jiyx
 * @create 2017-03-14-14:52
 */
public class MulOpration extends Opration {
    public double getResult() {
        return getFirstNum() * getSecondNum();
    }
}
