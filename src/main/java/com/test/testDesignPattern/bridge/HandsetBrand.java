package com.test.testDesignPattern.bridge;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-08-12:29
 */
public abstract class HandsetBrand {
    public HandsetSoft soft;

    public HandsetBrand(HandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();

    public HandsetSoft getSoft() {
        return soft;
    }

    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }
}
