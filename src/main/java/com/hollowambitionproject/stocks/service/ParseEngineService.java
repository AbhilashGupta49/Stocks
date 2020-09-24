package com.hollowambitionproject.stocks.service;

import java.util.Map;

import com.hollowambitionproject.stocks.domain.StocksData;

/**
 * The Interface ParseEngine.
 */
public interface ParseEngineService {

	/**
	 * Parses the data.
	 *
	 * @param data the data
	 */
	public void parseData(Map<String, Map<String, StocksData>> data);

}
