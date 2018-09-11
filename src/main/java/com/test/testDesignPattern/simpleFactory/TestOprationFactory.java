package com.test.testDesignPattern.simpleFactory;

import java.util.Scanner;

/**
 * 简单工厂模式测试
 *
 * @author jiyx
 * @create 2017-03-14-12:46
 */
public class TestOprationFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNum = "";
        while (true) {
            System.out.println("请输入第一个数字");
            firstNum = scanner.next();
            if (firstNum != null && !"".equals(firstNum)) {
                if (firstNum.matches("\\d*")) {
                    break;
                }
            }
        }
        String opration = "";
        while (true) {
            System.out.println("请输入计算符号(+,-,*,/)");
            opration = scanner.next();
            if (opration != null && !"".equals(opration)) {
                if (opration.matches("[\\+\\-\\*\\/]")) {
                    break;
                }
            }
        }
        String secondNum = "";
        while (true) {
            System.out.println("请输入第二个数字");
            secondNum = scanner.next();
            if (secondNum != null && !"".equals(secondNum)) {
                if (secondNum.matches("\\d*")) {
                    break;
                }
            }
        }
        Opration opration1 = OprationFactory.getOpration(opration);
        Double result = 0d;
        try {
            opration1.setFirstNum(Double.valueOf(firstNum));
            opration1.setSecondNum(Double.valueOf(secondNum));
            result = opration1.getResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}
