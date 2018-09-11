package com.test.testDesignPattern.strategy.simpleFactory.promotion;

/**
 * 工厂法法实现打折信息，如果打折信息频繁更改的话，这里也需要频繁更改，所以简单工厂模式在这种情况下不是很适合。
 *
 * @author jiyx
 * @create 2017-03-14-17:55
 */
public class FactoryPro {
    public static Promotion getPro(float ...num) {
        if (num.length == 1) {
            return new DiscountPro(num[0]);
        } else if (num.length == 2){
            return new FullbackPro(num[0] > num[1] ? num[0] : num[1],num[0] > num[1] ? num[1] : num[0]);
        }
        return null;
    }
}
