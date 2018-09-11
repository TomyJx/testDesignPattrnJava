package com.test.testDesignPattern.prototype;

/**
 * 原型模式的实现只需要实现java的接口
 *
 * @author jiyx
 * @create 2017-03-28-11:44
 */
public class Student implements Cloneable{

    private String name;

    private int age;

    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age, School school) {

        this.name = name;
        this.age = age;
        this.school = school;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        // 浅拷贝 只拷贝了一层
//        return (Student) super.clone();
        // 深拷贝 把student下的school也进行了拷贝
        Student student;
        student = (Student) super.clone();
        student.setSchool(school.clone());
        return student;
    }
}
