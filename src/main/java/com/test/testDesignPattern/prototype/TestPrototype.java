package com.test.testDesignPattern.prototype;

/**
 * 原型模式
 *
 * @author jiyx
 * @create 2017-03-28-12:39
 */
public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        School school = new School("小学", "高家坝");
        Student s1 = new Student("小明", 11, school);
        Student clone = s1.clone();
        System.out.println("clone : " + clone.toString());
        System.out.println("s1 : " + s1.toString());
        clone.setAge(14);
        clone.setName("小黑");
        clone.getSchool().setName("中学");
        clone.getSchool().setAddress("马甲吧");
        System.out.println("clone : " + clone.toString());
        System.out.println("s1 : " + s1.toString());
    }
}
