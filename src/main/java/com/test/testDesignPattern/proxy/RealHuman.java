package com.test.testDesignPattern.proxy;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-25-12:59
 */
public class RealHuman implements Human {

	private String name;

	public RealHuman(String name) {
		this.name = name;
	}

	@Override
	public void giveGifts() {
		System.out.println("我要送花给小妹");
	}
}
