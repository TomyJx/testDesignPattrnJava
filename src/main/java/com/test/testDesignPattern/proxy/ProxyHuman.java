package com.test.testDesignPattern.proxy;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-25-12:59
 */
public class ProxyHuman implements Human {

	private RealHuman realHuman;

	public ProxyHuman(RealHuman realHuman) {
		this.realHuman = realHuman;
	}

	@Override
	public void giveGifts() {
		realHuman.giveGifts();
	}
}
