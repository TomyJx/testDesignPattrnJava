package com.test.testDesignPattern.State;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-08-14:32
 */
public class DressStateSummer extends DressState {
    void dress(ContextDress contextDress) {
        if ((contextDress.getMonth() % 12) <= 6 && (contextDress.getMonth() % 12) > 3 ) {
            System.out.println("当前月份是：" + contextDress.getMonth() % 12 + "看来是" + "夏天来了，穿衣指数2颗星，适合穿短袖、短裤");
        } else {
            System.out.println("当前月份是：" + contextDress.getMonth() % 12 + "看来是" + "秋天来了，穿衣指数6颗星，适合穿薄毛衣、长裤");
            contextDress.setCurrentState(new DressStateAutumn());
        }
    }
}
