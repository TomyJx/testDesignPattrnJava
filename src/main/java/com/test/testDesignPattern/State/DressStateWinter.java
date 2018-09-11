package com.test.testDesignPattern.State;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-08-14:35
 */
public class DressStateWinter extends DressState {
    void dress(ContextDress contextDress) {
        if ((contextDress.getMonth() % 12) == 0 || ((contextDress.getMonth() % 12) < 12 && (contextDress.getMonth() % 12) > 9)) {
            System.out.println("当前月份是：" + contextDress.getMonth() + "看来是" + "冬天来了，穿衣指数11颗星，适合穿棉衣、棉裤");
        } else {
            System.out.println("当前月份是：" + contextDress.getMonth() % 12 + "看来是" + "春天来了，穿衣指数5颗星，适合穿长衫、长裤");
            contextDress.setCurrentState(new DressStateSpring());
        }
    }
}
