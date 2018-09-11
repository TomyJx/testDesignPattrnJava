package com.test.testDesignPattern.State;

/**
 * 状态模式
 *
 * @author jiyx
 * @create 2017-04-08-14:11
 */
public class Test {

    public static void main(String[] args) {
        ContextDress contextDress = new ContextDress();
        int i = 0;
        while (++i < 20) {
            contextDress.setMonth(i);
            contextDress.dress();
        }
    }

}
