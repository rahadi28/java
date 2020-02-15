package com.enigmacamp;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementArray {
	private static String[] removeDuplicateElementArray(String[] arr) {
		Set<String> temp = new HashSet();

		for (int i = 0; i < arr.length; i++) {
			temp.add(arr[i]);
		}

		int index = 0;
		String[] result = new String[temp.size()];

		for (String string : temp) {
			result[index] = string;
			index++;
		}

		return result;
	}

	public static void main(String[] args) {
		String[] input = { "1", "-2", "3", "XX", "1" };
		String[] result = removeDuplicateElementArray(input);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}