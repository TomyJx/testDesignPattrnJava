package com.test.testDesignPattern.bridge;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-08-12:33
 */
public class HandsetAddressList implements HandsetSoft {
    public void run(String brand) {
        System.out.println(brand + "手机通讯录运行");
    }
}
