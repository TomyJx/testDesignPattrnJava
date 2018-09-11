package myHighChartsTest.bo;

import myHighChartsTest.ChartCompent;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-18-10:29
 */
public class Legend implements ChartCompent {

	private String align;

	private int x;

	private int y;

	private String verticalAlign;

	private boolean floating;

	private String borderColor;

	private int borderWidth;

	private boolean shadow;

	public String getAlign() {
		return align;
	}

	public void setAlign(String align) {
		this.align = align;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getVerticalAlign() {
		return verticalAlign;
	}

	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

	public boolean isFloating() {
		return floating;
	}

	public void setFloating(boolean floating) {
		this.floating = floating;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public boolean isShadow() {
		return shadow;
	}

	public void setShadow(boolean shadow) {
		this.shadow = shadow;
	}
}
