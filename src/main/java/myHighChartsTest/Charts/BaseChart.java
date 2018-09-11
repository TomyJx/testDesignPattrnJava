package myHighChartsTest.Charts;

import myHighChartsTest.bo.*;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-17-15:19
 */
public abstract class BaseChart {
	private Chart chart;
	private Title title;
	private Subtitle subtitle;
	private XAxis xAxis;
	private YAxis yAxis;
	private Tooltip tooltip;
	private PlotOptions plotOptions;
	private Series series;
	private Legend legend;

	public Chart getChart() {
		return chart;
	}

	public void setChart(Chart chart) {
		this.chart = chart;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Subtitle getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(Subtitle subtitle) {
		this.subtitle = subtitle;
	}

	public XAxis getxAxis() {
		return xAxis;
	}

	public void setxAxis(XAxis xAxis) {
		this.xAxis = xAxis;
	}

	public YAxis getyAxis() {
		return yAxis;
	}

	public void setyAxis(YAxis yAxis) {
		this.yAxis = yAxis;
	}

	public Tooltip getTooltip() {
		return tooltip;
	}

	public void setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
	}

	public PlotOptions getPlotOptions() {
		return plotOptions;
	}

	public void setPlotOptions(PlotOptions plotOptions) {
		this.plotOptions = plotOptions;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public Legend getLegend() {
		return legend;
	}

	public void setLegend(Legend legend) {
		this.legend = legend;
	}
}
