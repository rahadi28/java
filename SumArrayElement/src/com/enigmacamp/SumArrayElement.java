package com.enigmacamp;

public class SumArrayElement {
	private static int sumArrayElement(String[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i].charAt(0);

			if (Character.isAlphabetic(c)) {
				result *= 2;
			} else {
				result += Integer.valueOf(arr[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String[] input = { "1", "-2", "3", "X", "1" };
		System.out.println(sumArrayElement(input));
	}
}