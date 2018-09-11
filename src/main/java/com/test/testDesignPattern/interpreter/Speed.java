package com.test.testDesignPattern.interpreter;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-22-15:05
 */
public class Speed extends Expression {
	@Override
	public void execute(String playKey, String playValue) {
		String speed = "";
		int value = Integer.valueOf(playValue);
		if (value < 500) {
			speed = "快速";
		} else if (value > 1000) {
			speed = "慢速";
		} else {
			speed = "中速";
		}
		System.out.print(speed + " ");
	}
}
