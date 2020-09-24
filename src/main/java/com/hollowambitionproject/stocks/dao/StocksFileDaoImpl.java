package com.hollowambitionproject.stocks.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hollowambitionproject.stocks.constants.ApplicationConstants;
import com.hollowambitionproject.stocks.domain.StocksData;
import com.hollowambitionproject.stocks.domain.StocksDataInput;

/**
 * The Class StocksFileDaoImpl.
 */
@Component("stocksFileDaoImpl")
@Primary()
public class StocksFileDaoImpl implements StocksFileDao {

	private static final Logger LOG = LogManager.getLogger(StocksFileDaoImpl.class);

	/**
	 * Gets the parsed stocks.
	 *
	 * @param caseNumber the case number
	 * @return the parsed stocks
	 */
	@Override
	public Map<String, Map<String, StocksData>> getParsedStocks(int caseNumber) {
		Map<String, Map<String, StocksData>> data = new HashMap<>();

		ObjectMapper mapper = new ObjectMapper();
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(StocksFileDaoImpl.class.getResourceAsStream(getFilePath(caseNumber))));
		String line = "";
		while (line != null) {
			try {
				line = reader.readLine();
				StocksDataInput input = mapper.readValue(line, StocksDataInput.class);
				String stockName = input.getStock_symbol();
				// Get format
				String date = input.getTimestamp().substring(0, 10);
				StocksData output = null;
				// Check if data is already present for a stock and date combination
				if (data.containsKey(stockName) && data.get(stockName).containsKey(date)) {
					output = data.get(stockName).get(date);
					// adding to total
					output.addTotal(input.getPrice());
					// increment by 1
					output.addCount();
					// Total and Count are for calculating average in the end
					if (input.getPrice() < output.getMin()) {
						output.setMin(input.getPrice());
					}
					if (input.getPrice() > output.getMax()) {
						output.setMax(input.getPrice());
					}
				} else {
					// Initialize a new stock object
					output = new StocksData(input.getPrice(), input.getPrice(), 1, input.getPrice(), date, stockName);
					if (data.containsKey(stockName)) {
						data.get(stockName).put(date, output);
					} else {
						Map<String, StocksData> stock = new HashMap<>();
						stock.put(date, output);
						data.put(stockName, stock);
					}
				}

			} catch (Exception e) {
				LOG.error("Error in parsing line. Continuing...");
			}
		}
		return data;
	}

	/**
	 * Gets the file path.
	 *
	 * @param caseNumber the case number
	 * @return the file path
	 */
	public String getFilePath(int caseNumber) {
		switch (caseNumber) {
		case 1:
			return ApplicationConstants.PATH_TEST_1;
		case 2:
			return ApplicationConstants.PATH_TEST_2;
		}
		return null;
	}

}
