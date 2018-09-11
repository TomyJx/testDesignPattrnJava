package com.test.testDesignPattern.mediator;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-12-12:38
 */
public class Usa extends Country {

    public Usa(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    public void getMessage(String message) {
        System.out.println("美国收到消息：" + message);
    }
}
