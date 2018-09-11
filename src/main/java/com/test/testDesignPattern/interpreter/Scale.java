package com.test.testDesignPattern.interpreter;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-22-14:32
 */
public class Scale extends Expression {
	@Override
	public void execute(String playKey, String playValue) {
		String scale = "";
		switch (playValue) {
			case "1":
				scale = "低音";
				break;
			case "2":
				scale = "中音";
				break;
			case "3":
				scale = "高音";
				break;
		}
		System.out.print(scale + " ");
	}
}
