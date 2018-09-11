package com.test.testDesignPattern.visitor;

/**
 * 状态类
 *
 * @author jiyx
 * @create 2017-05-24-12:30
 */
public interface Visitor {
	void menSay(Men men);

	void womenSay(Women women);
}
