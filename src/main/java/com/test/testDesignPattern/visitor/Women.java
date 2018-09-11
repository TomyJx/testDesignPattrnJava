package com.test.testDesignPattern.visitor;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-24-12:33
 */
public class Women implements Person {

	public String type = "女人";

	@Override
	public void say(Visitor visitor) {
		visitor.womenSay(this);
	}
}
