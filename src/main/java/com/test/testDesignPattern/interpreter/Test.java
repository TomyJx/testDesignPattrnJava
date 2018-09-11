package com.test.testDesignPattern.interpreter;

/**
 * 解释器模式
 *
 * @author jiyx
 * @create 2017-05-22-12:47
 */
public class Test {
	public static void main(String[] args) {
		PlayContext context = new PlayContext();
		context.setText("T 400 O 2 E 0.5 G 0.5 A 3 E 0.2 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3");
		Expression expression = null;
		while (context.getText().length() > 0) {
			String str = context.getText().substring(0, 1);
			switch (str) {
				case "O":
					expression = new Scale();
					break;
				case "T":
					expression = new Speed();
					break;
				case "C":
				case "D":
				case "E":
				case "F":
				case "G":
				case "A":
				case "B":
					expression = new Note();
			}
			expression.interperter(context);
		}
//		byte bb1 = 126;
//		byte bb2 = 5;
//		System.out.println((byte) (bb1 + bb2));
//		System.out.println((byte) (125));
//		System.out.println((byte) (128));
//		System.out.println((byte) (127));
	}
}
