package com.hollowambitionproject.stocks.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hollowambitionproject.stocks.domain.StocksData;

/**
 * The Class PrintUtil.
 */
public class PrintUtil {

	/** The Constant LOG. */
	private static final Logger LOG = LogManager.getLogger(PrintUtil.class);

	/**
	 * Prints the output.
	 *
	 * @param list the list
	 */
	public static void printOutput(StocksData data) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println(mapper.writeValueAsString(data));
		} catch (JsonProcessingException e) {
			LOG.error("Error in parsing line. Continuing...");
		}
	}

}
