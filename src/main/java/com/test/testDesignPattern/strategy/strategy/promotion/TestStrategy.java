package com.test.testDesignPattern.strategy.strategy.promotion;

/**
 * 策略模式实现
 *
 * @author jiyx
 * @create 2017-03-14-12:51
 */
public class TestStrategy {
    public static void main(String[] args) throws Exception {
//        PromotionStrategy promotionStrategy = new FullbackPro(300, 100);
        PromotionStrategy promotionStrategy = new DiscountPro(0.2f);
        StrategyContext context = new StrategyContext(promotionStrategy);
        double result = context.getResultPrice(100);
        System.out.println(result);
    }
}
