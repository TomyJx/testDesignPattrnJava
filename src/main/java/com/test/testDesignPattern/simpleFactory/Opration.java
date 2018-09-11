package com.test.testDesignPattern.simpleFactory;

/**
 * 这里用到的是简单工厂设计模式
 * 因为计算的时候一般都是二维运算，这里也只考虑二维运算。那么二维运算只是运算符不一样而已。
 * 这里抽象出一个公共类，此类定义了两个不同的参数。同时定义了一个抽象方法取得计算结果。
 * 具体的计算交给各自的实现类去执行
 *
 * @author jiyx
 * @create 2017-03-14-14:45
 */
public abstract class Opration {
    private double firstNum;
    private double secondNum;

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public abstract double getResult() throws Exception;
}
