package com.test.testDesignPattern.visitor;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-24-12:33
 */
public class Success implements Visitor {
	@Override
	public void menSay(Men men) {
		System.out.format("成功时，%s很潇洒", men.type);
		System.out.println();
	}

	@Override
	public void womenSay(Women women) {
		System.out.format("成功时，%s很妩媚", women.type);
		System.out.println();
	}
}
