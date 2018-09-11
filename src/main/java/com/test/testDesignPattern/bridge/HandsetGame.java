package com.test.testDesignPattern.bridge;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-08-12:32
 */
public class HandsetGame implements HandsetSoft {
    public void run(String brand) {
        System.out.println(brand + "手机游戏运行");
    }
}
