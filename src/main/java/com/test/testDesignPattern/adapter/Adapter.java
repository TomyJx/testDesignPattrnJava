package com.test.testDesignPattern.adapter;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-11-12:42
 */
public class Adapter extends AbstractPlayer {

    private ForeignPlayers foreignPlayers;

    public Adapter(String name) {
        super(name);
        this.foreignPlayers = new ForeignPlayers(name);
    }

    void attack() {
        foreignPlayers.jingong();
    }

    void defense() {
        foreignPlayers.fangshou();
    }
}
