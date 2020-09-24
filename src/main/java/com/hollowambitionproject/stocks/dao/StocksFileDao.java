package com.hollowambitionproject.stocks.dao;

import java.util.Map;

import com.hollowambitionproject.stocks.domain.StocksData;

/**
 * The Interface StocksFileDao.
 */
public interface StocksFileDao {

	/**
	 * Gets the parsed stocks.
	 *
	 * @param caseNumber the case number
	 * @return the parsed stocks
	 */
	Map<String, Map<String, StocksData>> getParsedStocks(int caseNumber);

}
