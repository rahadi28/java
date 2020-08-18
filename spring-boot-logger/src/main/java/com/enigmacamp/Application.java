package com.enigmacamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.enigmacamp.service.CalculatorService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	private final Logger logger = LoggerFactory.getLogger(Application.class);

	@Autowired
	CalculatorService calculatorService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.trace("This is a trace message");
		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		logger.debug(calculatorService.addition(2, 3));
		logger.debug(calculatorService.division(2, 0));
	}
}