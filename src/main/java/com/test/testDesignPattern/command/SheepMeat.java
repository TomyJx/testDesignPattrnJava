package com.test.testDesignPattern.command;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-09-22:23
 */
public class SheepMeat extends Command {
    public SheepMeat(Cooker cooker) {
        super(cooker);
    }

    public void executeCommand() {
        cooker.cookSheepMeat();
    }
}
