package com.test.testDesignPattern.templateMethod;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-28-12:55
 */
public abstract class Pay {
    public void payed() {
        System.out.println("您通过" + payMethod() +
                "已经成功支付");
    }

    protected abstract String payMethod();
}
