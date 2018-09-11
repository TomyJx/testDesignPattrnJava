package com.test.testDesignPattern.strategy.simpleFactory.promotion;

/**
 * 简单工厂模式实现商场的优惠
 * 不管是打折还是满XXX送XXX这两种优惠策略都应该传入一个原始价格，返回他的优惠后价格
 *
 * @author jiyx
 * @create 2017-03-14-17:37
 */
public interface Promotion {
    public double getProPrice(double srcPrice) throws Exception;
}