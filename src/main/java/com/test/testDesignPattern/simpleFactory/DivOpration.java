package com.test.testDesignPattern.simpleFactory;

/**
 * 出发运算实现类
 *
 * @author jiyx
 * @create 2017-03-14-14:53
 */
public class DivOpration extends Opration{
    public double getResult() throws Exception {
        if (getSecondNum() == 0) {
            throw new Exception("除数不能为0");
        }
        return getFirstNum() / getSecondNum();
    }
}
