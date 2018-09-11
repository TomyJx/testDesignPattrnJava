package com.test.testDesignPattern.State;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-08-14:27
 */
public class DressStateSpring extends DressState {

    void dress(ContextDress contextDress) {
        if ((contextDress.getMonth() % 12) <= 3 && (contextDress.getMonth() % 12) > 0) {
            System.out.println("当前月份是：" + contextDress.getMonth() % 12 + "看来是" + "春天来了，穿衣指数5颗星，适合穿长衫、长裤");
        } else {
            System.out.println("当前月份是：" + contextDress.getMonth() % 12 + "看来是" + "夏天来了，穿衣指数2颗星，适合穿短袖、短裤");
            contextDress.setCurrentState(new DressStateSummer());
        }
    }
}
