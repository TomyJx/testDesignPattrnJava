package com.test.testDesignPattern.simpleFactory;

/**
 * 工厂类，创建各计算类。
 *
 * @author jiyx
 * @create 2017-03-14-14:56
 */
public class OprationFactory {
    public static Opration getOpration(String opration){
        if ("+".equals(opration)){
            return new AddOpration();
        } else if ("-".equals(opration)) {
            return new ReduceOpration();
        } else if ("*".equals(opration)) {
            return new MulOpration();
        } else if ("/".equals(opration)){
            return new DivOpration();
        }
        return null;
    }
}
