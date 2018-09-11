package com.test.testDesignPattern.templateMethod;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-28-12:57
 */
public class WeiXinPay extends Pay {

    protected String payMethod() {
        return "微信";
    }
}
