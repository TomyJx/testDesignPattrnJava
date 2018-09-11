package com.test.testDesignPattern.State;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-08-14:33
 */
public class DressStateAutumn extends DressState {
    void dress(ContextDress contextDress) {
        if ((contextDress.getMonth() % 12) <= 9 && (contextDress.getMonth() % 12) > 6) {
            System.out.println("当前月份是：" + contextDress.getMonth() % 12 + "看来是" + "秋天来了，穿衣指数6颗星，适合穿薄毛衣、长裤");
        } else {
            System.out.println("当前月份是：" + contextDress.getMonth() % 12 + "看来是" + "冬天来了，穿衣指数11颗星，适合穿棉衣、棉裤");
            contextDress.setCurrentState(new DressStateWinter());
        }
    }
}
