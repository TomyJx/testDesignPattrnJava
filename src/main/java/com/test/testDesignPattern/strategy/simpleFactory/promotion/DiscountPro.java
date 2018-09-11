package com.test.testDesignPattern.strategy.simpleFactory.promotion;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-14-17:43
 */
public class DiscountPro implements Promotion{

    private float disNum;

    public float getDisNum() {
        return disNum;
    }

    public void setDisNum(float disNum) {
        this.disNum = disNum;
    }

    public DiscountPro(float disNum) {
        this.disNum = disNum;
    }

    // 折扣信息是1的时候是原价，是0的时候是免费送
    public double getProPrice(double srcPrice) throws Exception {
        if (disNum > 1 || disNum < 0) {
            throw new Exception("折扣应该在0到1之间");
        }
        return srcPrice * disNum;
    }
}
