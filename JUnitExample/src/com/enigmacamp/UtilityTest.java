package com.enigmacamp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilityTest {
	@Test
	void testConvertTocamelCase() {
		Utility util = new Utility();
		String expected = "rahadiOemar";
		assertEquals(expected, util.convertTocamelCase("rahadi_oemar"));
	}
}