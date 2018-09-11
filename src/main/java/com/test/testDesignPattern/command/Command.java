package com.test.testDesignPattern.command;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-09-12:42
 */
public abstract class Command {
    protected Cooker cooker;

    public Command(Cooker cooker) {
        this.cooker = cooker;
    }

    public abstract void executeCommand();
}
