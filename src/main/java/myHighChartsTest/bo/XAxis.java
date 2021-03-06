package myHighChartsTest.bo;

import myHighChartsTest.ChartCompent;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-18-10:28
 */
public class XAxis implements ChartCompent {

	private List<ChartCompent> compents;

	@Override
	public void add(ChartCompent compent) {
		compents.add(compent);
	}

	@Override
	public void remove(ChartCompent compent) {
		compents.remove(compent);
	}
}
