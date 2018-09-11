package com.test.testDesignPattern.templateMethod;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-28-12:59
 */
public class TestPay {
    public static void main(String[] args) {
        Pay pay = new WeiXinPay();
        pay.payed();
        pay = new ZhiFuBaoPay();
        pay.payed();
    }
}
