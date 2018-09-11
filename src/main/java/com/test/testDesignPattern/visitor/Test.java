package com.test.testDesignPattern.visitor;

/**
 * 访问者模式
 *
 * @author jiyx
 * @create 2017-05-24-12:29
 */
public class Test {
	public static void main(String[] args) {
		ObjectStructrue o = new ObjectStructrue();
		o.add(new Men());
		o.add(new Women());

		Success s = new Success();
		o.execute(s);

		Fail f = new Fail();
		o.execute(f);
	}
}
