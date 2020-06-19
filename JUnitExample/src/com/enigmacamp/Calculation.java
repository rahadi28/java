package com.enigmacamp;

import java.util.StringTokenizer;

public class Calculation {
	public Calculation() {
		super();
	}

	public int divide(int a, int b) {
		if (b == 0) {
			throw new RuntimeException("The divisor cannot be 0");
		}
		return a / b;
	}

	// method that returns maximum number
	public static int findMax(int arr[]) {
		int max = arr[0]; // arr[0] instead of 0
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

	// method that returns cube of the given number
	public static int cube(int n) {
		return n * n * n;
	}

	// method that returns reverse words
	public static String reverseWord(String str) {
		StringBuilder result = new StringBuilder();
		StringTokenizer tokenizer = new StringTokenizer(str, " ");

		while (tokenizer.hasMoreTokens()) {
			StringBuilder sb = new StringBuilder();
			sb.append(tokenizer.nextToken());
			sb.reverse();

			result.append(sb);
			result.append(" ");
		}
		return result.toString();
	}
}