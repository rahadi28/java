package com.enigmacamp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class CalculationTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@Test
	void testDivide() {
		System.out.println("test case divide");
		Calculation cal = new Calculation();
		RuntimeException re = assertThrows(RuntimeException.class, () -> {
			cal.divide(6, 0);
		});
		assertEquals("The divisor cannot be 0", re.getMessage());
		assertEquals(2, cal.divide(6, 3));
	}

	@Test
	public void testFindMax() {
		System.out.println("test case find max");
		assertEquals(4, Calculation.findMax(new int[] { 1, 3, 4, 2 }));
		assertEquals(-1, Calculation.findMax(new int[] { -12, -1, -3, -4, -2 }));
	}

	@Test
	public void testCube() {
		System.out.println("test case cube");
		assertEquals(27, Calculation.cube(3));
	}

	@Test
	public void testReverseWord() {
		System.out.println("test case reverse word");
		assertEquals("ym eman si nahk ", Calculation.reverseWord("my name is khan"));
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}
}
