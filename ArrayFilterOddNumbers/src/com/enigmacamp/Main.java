package com.enigmacamp;

import java.util.Arrays;

public class Main {
	private Integer[] filterOddNumbers(Integer[] numbers) {
		Integer[] result = new Integer[numbers.length];
		int j = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				result[j] = numbers[i];
				j++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Main app = new Main();
		Integer[] numbers = { 2, 1, 3, 4, 7 };
		System.out.println(Arrays.deepToString(app.filterOddNumbers(numbers)));

	}
}