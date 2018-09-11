package com.test.testDesignPattern.interpreter;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-22-12:50
 */
public abstract class Expression {
	// 解释器
	public void interperter(PlayContext context) {
		String text = context.getText();
		String playKey;
		String playValue;
		if (text.length() == 0) {
			return;
		} else {
			playKey = text.substring(0, 1);
			text = text.substring(2);
			if (text.indexOf(" ") != -1) {
				playValue = text.substring(0, text.indexOf(" "));
				context.setText(text.substring(text.indexOf(" ") + 1));
			} else {
				playValue = text.substring(0);
				context.setText("");
			}
		}

		execute(playKey, playValue);
	}

	public abstract void execute(String playKey, String playValue);
}
