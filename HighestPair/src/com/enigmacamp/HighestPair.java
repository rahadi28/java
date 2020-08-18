package com.enigmacamp;

import java.util.Arrays;

public class HighestPair {
	private static int[] bubbleSort(int[] arr) {
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - 1; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

	private static int[] highestPair(int[] arr) {
		int[] result = new int[2];
		int[] res = bubbleSort(arr);
		result[0] = res[arr.length - 2];
		result[1] = res[arr.length - 1];

		return result;
	}

	public static void main(String[] args) {
		int[] input = { 1, 3, 2, 4 };
		int[] result = highestPair(input);
		System.out.println(Arrays.toString(result));
	}
}