package com.test.testDesignPattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-09-12:45
 */
public class Waiter {
    private List<Command> commandList = new ArrayList<Command>();

    // 下单
    public void addCommand(Command command) {
        if (command instanceof SheepMeat) {
            System.out.println("烤羊腿还剩下十个了");
        }
        if (command instanceof ChickenWings) {
            System.out.println("烤鸡腿也不多了");
        }
        commandList.add(command);
    }

    // 通知后厨做菜
    public void inform() {
        if (commandList.size() > 0) {
            for (int i = 0; i < commandList.size(); i++) {
                commandList.get(i).executeCommand();
            }
        }
    }

    // reset
    public void reset() {
        commandList = new ArrayList<Command>();
    }
}
