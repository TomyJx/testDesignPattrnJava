package com.test.testDesignPattern.chainOfResponsibility;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-09-22:47
 */
public class TopManager extends Manager {

    public TopManager(String name) {
        super(name);
    }

    public void approve(Request request) {
        // 加班的都同意
        if (request.getType() == 0) {
            System.out.println(request.getName() + "的加班请求" + this.name + "同意");
        // 请假的都不同意
        } else if (request.getType() == 1) {
            System.out.println(request.getName() + "的请假" + request.getNum() + "天的请求" + this.name + "同意");
        // 加薪看情况
        } else if (request.getType() == 2) {
            if (request.getNum() < 500) {
                System.out.println(request.getName() + "的加薪" + request.getNum() + "的请求" + this.name + "同意");
            } else {
                System.out.println(request.getName() + "的加薪" + request.getNum() + "的请求" + this.name + "不同意");
            }
        }
    }

}
