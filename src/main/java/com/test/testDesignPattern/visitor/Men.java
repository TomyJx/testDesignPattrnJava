package com.test.testDesignPattern.visitor;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-24-12:32
 */
public class Men implements Person {


	public String type = "男人";

	@Override
	public void say(Visitor visitor) {
		visitor.menSay(this);
	}
}
