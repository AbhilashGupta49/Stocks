package com.hollowambitionproject.stocks.domain;

/**
 * The Class StocksDataInput.
 */
public class StocksDataInput {

	/** The stock symbol. */
	private String stock_symbol;

	/** The price. */
	private long price;

	/** The timestamp. */
	private String timestamp;

	/**
	 * Instantiates a new stocks data input.
	 */
	public StocksDataInput() {

	}

	/**
	 * Instantiates a new stocks data input.
	 *
	 * @param stock_symbol the stock symbol
	 * @param price        the price
	 * @param timestamp    the timestamp
	 */
	public StocksDataInput(String stock_symbol, long price, String timestamp) {
		super();
		this.stock_symbol = stock_symbol;
		this.price = price;
		this.timestamp = timestamp;
	}

	/**
	 * Gets the stock symbol.
	 *
	 * @return the stock symbol
	 */
	public String getStock_symbol() {
		return stock_symbol;
	}

	/**
	 * Sets the stock symbol.
	 *
	 * @param stock_symbol the new stock symbol
	 */
	public void setStock_symbol(String stock_symbol) {
		this.stock_symbol = stock_symbol;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(long price) {
		this.price = price;
	}

	/**
	 * Gets the timestamp.
	 *
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp.
	 *
	 * @param timestamp the new timestamp
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}
