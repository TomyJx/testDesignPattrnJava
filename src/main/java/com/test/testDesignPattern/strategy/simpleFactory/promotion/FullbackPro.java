package com.test.testDesignPattern.strategy.simpleFactory.promotion;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-14-17:50
 */
public class FullbackPro implements Promotion {
    private float fullNum;
    private float backNum;

    public FullbackPro(float fullNum, float backNum) {
        this.fullNum = fullNum;
        this.backNum = backNum;
    }

    public float getFullNum() {
        return fullNum;
    }

    public void setFullNum(float fullNum) {
        this.fullNum = fullNum;
    }

    public float getBackNum() {
        return backNum;
    }

    public void setBackNum(float backNum) {
        this.backNum = backNum;
    }

    public double getProPrice(double srcPrice) throws Exception {
        if (fullNum <= backNum) {
            throw new Exception("折扣信息不合法");
        }
        return srcPrice - (int)(srcPrice / fullNum) * backNum;
    }
}
