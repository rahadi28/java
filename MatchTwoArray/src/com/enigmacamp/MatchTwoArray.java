package com.enigmacamp;

import java.util.ArrayList;
import java.util.List;

public class MatchTwoArray {
	private static int countMatchTwoArray(String[] arr1, String[] arr2) {
		List<String> arrayList = new ArrayList<String>();

		for (int i = 0; i < arr2.length; i++) {
			arrayList.add(arr2[i]);
		}

		int result = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (arrayList.contains(arr1[i])) {
				result++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		String[] cars2 = { "Volvo", "BMW", "Ford", "Oplet" };
		
		System.out.println(countMatchTwoArray(cars, cars2));
	}
}