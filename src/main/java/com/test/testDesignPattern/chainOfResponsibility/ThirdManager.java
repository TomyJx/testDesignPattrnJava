package com.test.testDesignPattern.chainOfResponsibility;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-10-12:49
 */
public class ThirdManager extends Manager {

    public ThirdManager(String name) {
        super(name);
    }

    public void approve(Request request) {
        // 加班的都同意
        if (request.getType() == 0) {
            System.out.println(request.getName() + "的加班请求" + this.name + "同意");
            // 请假的都不同意
        } else if (request.getType() == 1) {
            superManager.approve(request);
        } else if (request.getType() == 2) {
            superManager.approve(request);
        }
    }
}
