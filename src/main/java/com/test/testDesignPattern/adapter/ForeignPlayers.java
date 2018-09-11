package com.test.testDesignPattern.adapter;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-11-12:43
 */
public class ForeignPlayers {

    public String name;

    public ForeignPlayers(String name) {
        this.name = name;
    }

    public void jingong(){
        System.out.println("外籍球员发起进攻");
    }

    public void fangshou(){
        System.out.println("外籍球员发起防守");
    }

}
