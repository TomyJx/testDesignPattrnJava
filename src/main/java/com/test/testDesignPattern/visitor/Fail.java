package com.test.testDesignPattern.visitor;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-24-12:43
 */
public class Fail implements Visitor {
	@Override
	public void menSay(Men men) {
		System.out.format("失败时，%s也沮丧", men.type);
		System.out.println();
	}

	@Override
	public void womenSay(Women women) {
		System.out.format("失败时，%s也坚强", women.type);
		System.out.println();
	}
}
