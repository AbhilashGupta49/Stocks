package com.hollowambitionproject.stocks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * The Class StocksApplication.
 */
@SpringBootApplication
@ComponentScan("com.hollowambitionproject")
public class StocksApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(StocksApplication.class, args);
		// Part 3 Test Case
		ctx.getBean(StocksRunner.class).start(2);
	}

}
