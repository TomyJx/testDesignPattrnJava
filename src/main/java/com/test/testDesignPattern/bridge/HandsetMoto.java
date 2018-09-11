package com.test.testDesignPattern.bridge;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-08-12:37
 */
public class HandsetMoto extends HandsetBrand {

    public HandsetMoto(HandsetSoft soft) {
        super(soft);
    }

    public void run() {
        soft.run("moto");
    }
}
