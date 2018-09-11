package myHighChartsTest.bo;

import myHighChartsTest.ChartCompent;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-18-10:25
 */
public class Chart implements ChartCompent {

	private String type;

	private int marginRight;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getMarginRight() {
		return marginRight;
	}

	public void setMarginRight(int marginRight) {
		this.marginRight = marginRight;
	}

}
