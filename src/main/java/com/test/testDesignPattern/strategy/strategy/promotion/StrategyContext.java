package com.test.testDesignPattern.strategy.strategy.promotion;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-03-28-11:14
 */
public class StrategyContext {
    private PromotionStrategy promotionStrategy;

    public StrategyContext(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public double getResultPrice(double price) throws Exception {
        return promotionStrategy.getProPrice(price);
    }
}
