package com.hollowambitionproject.stocks.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The Class StocksData.
 */
public class StocksData {

	/** The min. */
	private long min;

	/** The max. */
	private long max;

	/** The count. */
	@JsonIgnore
	private int count;

	/** The total. */
	@JsonIgnore
	private long total;

	/** The average. */
	private double average;

	/** The date. */
	private String date;

	/** The stock name. */
	private String stockName;

	/**
	 * Instantiates a new stocks data.
	 *
	 * @param min       the min
	 * @param max       the max
	 * @param count     the count
	 * @param total     the total
	 * @param date      the date
	 * @param stockName the stock name
	 */
	public StocksData(long min, long max, int count, long total, String date, String stockName) {
		super();
		this.min = min;
		this.max = max;
		this.count = count;
		this.total = total;
		this.date = date;
		this.stockName = stockName;
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Gets the stock name.
	 *
	 * @return the stock name
	 */
	public String getStockName() {
		return stockName;
	}

	/**
	 * Sets the stock name.
	 *
	 * @param stockName the new stock name
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	/**
	 * Gets the average.
	 *
	 * @return the average
	 */
	public double getAverage() {
		return average;
	}

	/**
	 * Sets the average.
	 *
	 * @param average the new average
	 */
	public void setAverage(double average) {
		this.average = average;
	}

	/**
	 * Gets the count.
	 *
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Sets the count.
	 *
	 * @param count the new count
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * Adds the count.
	 */
	public void addCount() {
		this.count++;
	}

	/**
	 * Gets the total.
	 *
	 * @return the total
	 */
	public long getTotal() {
		return total;
	}

	/**
	 * Sets the total.
	 *
	 * @param total the new total
	 */
	public void setTotal(long total) {
		this.total = total;
	}

	/**
	 * Adds the total.
	 *
	 * @param value the value
	 */
	public void addTotal(long value) {
		this.total += value;
	}

	/**
	 * Gets the min.
	 *
	 * @return the min
	 */
	public long getMin() {
		return min;
	}

	/**
	 * Sets the min.
	 *
	 * @param min the new min
	 */
	public void setMin(long min) {
		this.min = min;
	}

	/**
	 * Gets the max.
	 *
	 * @return the max
	 */
	public long getMax() {
		return max;
	}

	/**
	 * Sets the max.
	 *
	 * @param max the new max
	 */
	public void setMax(long max) {
		this.max = max;
	}

}
