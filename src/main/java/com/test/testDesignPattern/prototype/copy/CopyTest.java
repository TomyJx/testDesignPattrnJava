package com.test.testDesignPattern.prototype.copy;

/**
 * 深浅拷贝测试
 *
 * @author jiyx
 * @create 2017-03-24-12:16
 */
public class CopyTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Depart depart = new Depart();
        depart.setName("亚信");
        depart.setAddress("西北旺亚信大厦");
        Employee employee = new Employee("小李", 25, depart);
        Employee clone = employee.clone();
        System.out.println("employee:" + employee.getName() +
                "--" + employee.getAge() + employee.getDepart().getName() +
                "--" + employee.getDepart().getAddress());
        System.out.println("clone:" + clone.getName() +
                "--" + clone.getAge() + clone.getDepart().getName() +
                "--" + clone.getDepart().getAddress());
        clone.setName("小黑");
        clone.setAge(18);
        clone.getDepart().setName("华为");
        clone.getDepart().setAddress("西研");
        System.out.println("employee:" + employee.getName() +
                "--" + employee.getAge() + employee.getDepart().getName() +
                "--" + employee.getDepart().getAddress());
        System.out.println("clone:" + clone.getName() +
                "--" + clone.getAge() + clone.getDepart().getName() +
                "--" + clone.getDepart().getAddress());
        /*for (int i = 0; i < 3; i++) {
            new Thread(new Syc(new MyList())).start();
        }*/
//        new Thread(new Syc()).start();

    }
}
/*
class Syc implements Runnable {

    private MyList myList;

    public Syc() {

    }
    public Syc(MyList myList) {
        this.myList = myList;
    }

    public void run() {
        try {
            myList.add();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        *//*for (int i = 0; i < 3; i++) {
            MyList list = new MyList();
            try {
                list.add();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*//*
    }
}

class MyList {
    public static synchronized void add() throws InterruptedException {
        System.out.println(1);
        Thread.sleep(1000);
        System.out.println(2);
    }
}*/
