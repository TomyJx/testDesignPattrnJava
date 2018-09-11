package com.test.testDesignPattern.mediator;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-12-12:39
 */
public class Iraq extends Country {

    public Iraq(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    public void getMessage(String message) {
        System.out.println("伊拉克收到消息：" + message);
    }
}
