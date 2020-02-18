package com.enigmacamp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	private final Logger logger = LoggerFactory.getLogger(CalculatorService.class);

	public String addition(int i, int j) {
		try {
			int result = i + j;
			logger.debug(String.valueOf(result));
			return String.valueOf(result);
		} catch (Exception ex) {
			logger.error(ex.toString());
			return "";
		}
	}

	public String division(int i, int j) {
		try {
			int result = i / j;
			logger.debug(String.valueOf(result));
			return String.valueOf(result);
		} catch (Exception ex) {
			logger.error(ex.toString());
			return "";
		}
	}
}