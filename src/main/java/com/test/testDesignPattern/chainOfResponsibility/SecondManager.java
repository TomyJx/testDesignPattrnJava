package com.test.testDesignPattern.chainOfResponsibility;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-09-22:51
 */
public class SecondManager extends Manager {

    public SecondManager(String name) {
        super(name);
    }

    public void approve(Request request) {
        // 加班的都同意
        if (request.getType() == 0) {
            System.out.println(request.getName() + "的加班请求" + this.name + "同意");
            // 请假的都不同意
        } else if (request.getType() == 1) {
            if (request.getNum() <= 3) {
                System.out.println(request.getName() + "的请假" + request.getNum() + "天的请求" + this.name + "同意");
            } else {
                superManager.approve(request);
            }
            // 加薪看情况
        } else if (request.getType() == 2) {
            superManager.approve(request);
        }
    }
}
