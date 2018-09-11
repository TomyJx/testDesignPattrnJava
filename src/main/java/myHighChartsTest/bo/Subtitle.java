package myHighChartsTest.bo;

import myHighChartsTest.ChartCompent;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-18-10:26
 */
public class Subtitle implements ChartCompent {
	private String text;

	private List<ChartCompent> compents;

	@Override
	public void add(ChartCompent compent) {
		compents.add(compent);
	}

	@Override
	public void remove(ChartCompent compent) {
		compents.remove(compent);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
