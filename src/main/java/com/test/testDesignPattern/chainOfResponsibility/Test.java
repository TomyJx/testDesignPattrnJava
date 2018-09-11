package com.test.testDesignPattern.chainOfResponsibility;

/**
 * 职责连模式
 *
 * @author jiyx
 * @create 2017-05-09-22:46
 */
public class Test {
    public static void main(String[] args) {
        Manager top = new TopManager("总经理");
        Manager sec = new SecondManager("经理");
        Manager thi = new ThirdManager("组长");
        thi.setSuperManager(sec);
        sec.setSuperManager(top);

        Request request = new Request();
        request.setContent("加班");
        request.setName("小明");
        request.setType(0);
        request.setNum(3);

        thi.approve(request);

        request.setContent("请假");
        request.setNum(1);
        request.setType(1);
        request.setName("小红");
        thi.approve(request);

        request.setContent("请假");
        request.setNum(4);
        request.setType(1);
        request.setName("小小");
        thi.approve(request);

        request.setContent("加薪");
        request.setNum(499);
        request.setType(2);
        request.setName("小出");
        thi.approve(request);

        request.setContent("加薪");
        request.setNum(800);
        request.setType(2);
        request.setName("小分");
        thi.approve(request);
    }
}
