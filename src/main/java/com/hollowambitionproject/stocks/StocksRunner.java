package com.hollowambitionproject.stocks;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hollowambitionproject.stocks.dao.StocksFileDao;
import com.hollowambitionproject.stocks.domain.StocksData;
import com.hollowambitionproject.stocks.service.ParseEngineService;

/**
 * The Class StocksRunner.
 */
@Component
public class StocksRunner {

	/** The stocks file dao impl. */
	private StocksFileDao stocksFileDaoImpl;

	/** The parse engine impl. */
	private ParseEngineService parseEngineImpl;

	/**
	 * Instantiates a new stocks runner.
	 *
	 * @param stocksFileDao   the stocks file dao
	 * @param parseEngineImpl the parse engine impl
	 */
	@Autowired
	public StocksRunner(StocksFileDao stocksFileDao, ParseEngineService parseEngineImpl) {
		this.stocksFileDaoImpl = stocksFileDao;
		this.parseEngineImpl = parseEngineImpl;
	}

	/**
	 * Start.
	 *
	 * @param caseNumber the case number
	 */
	public void start(int caseNumber) {
		// Get Data from file
		Map<String, Map<String, StocksData>> stocksData = stocksFileDaoImpl.getParsedStocks(caseNumber);
		// Parse Data per stock per date and display output
		parseEngineImpl.parseData(stocksData);
	}

}
