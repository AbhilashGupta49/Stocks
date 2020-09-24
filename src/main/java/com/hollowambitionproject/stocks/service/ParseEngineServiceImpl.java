package com.hollowambitionproject.stocks.service;

import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.hollowambitionproject.stocks.domain.StocksData;
import com.hollowambitionproject.stocks.utils.PrintUtil;

/**
 * The Class ParseEngineImpl.
 */
@Component("parseEngineImpl")
@Primary()
public class ParseEngineServiceImpl implements ParseEngineService {

	/**
	 * Parses the data.
	 *
	 * @param data the data
	 * @return the list
	 */
	@Override
	public void parseData(Map<String, Map<String, StocksData>> data) {
		for (Map.Entry<String, Map<String, StocksData>> entry : data.entrySet()) {
			parseSingleTimeStamp(entry.getValue());
		}
	}

	/**
	 * Parses the single time stamp.
	 *
	 * @param data the data
	 */
	private void parseSingleTimeStamp(Map<String, StocksData> data) {
		for (StocksData value : data.values()) {
			value.setAverage(value.getTotal() / value.getCount());
			PrintUtil.printOutput(value);
		}
	}

	// For part 1 - All timestamps
//	/**
//	 * Parses the single stock.
//	 *
//	 * @param data the data
//	 * @return the stocks data
//	 */
//	private StocksData parseSingleStock(Map<String, StocksData> data) {
//		StocksData output = new StocksData();
//		for (StocksData value : data.values()) {
//			output.addTotal(value.getTotal());
//			output.addCount();
//			if (output.getMin() == 0 || value.getMin() < output.getMin()) {
//				output.setMin(value.getMin());
//			}
//			if (value.getMax() > output.getMax()) {
//				output.setMax(value.getMax());
//			}
//		}
//		if (output.getCount() != 0) {
//			output.setAverage(output.getTotal() / output.getCount());
//		}
//		return output;
//	}

}
