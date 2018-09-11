package com.test.testDesignPattern.proxy;

/**
 * 代理模式
 *
 * @author jiyx
 * @create 2017-05-25-12:57
 */
public class Test {
	public static void main(String[] args) {
		RealHuman realHuman = new RealHuman("小明");
		ProxyHuman proxyHuman = new ProxyHuman(realHuman);
		proxyHuman.giveGifts();
	}
}
