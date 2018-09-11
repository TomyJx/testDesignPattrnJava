package com.test.testDesignPattern.bridge;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-08-12:34
 */
public class HandsetNokia extends HandsetBrand {

    public HandsetNokia(HandsetSoft soft) {
        super(soft);
    }

    public void run() {
        soft.run("nokia");
    }
}
