package com.test.testDesignPattern.command;

/**
 * 命令模式
 *
 * @author jiyx
 * @create 2017-05-09-12:35
 */
public class Test {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        ChickenWings chickenWings = new ChickenWings(cooker);
        SheepMeat sheepMeat = new SheepMeat(cooker);
        Waiter waiter = new Waiter();

        waiter.addCommand(chickenWings);
        waiter.addCommand(sheepMeat);
        waiter.addCommand(sheepMeat);
        waiter.inform();
    }
}
