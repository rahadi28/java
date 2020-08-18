package com.enigmacamp;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateElementArray {
	private static void printDuplicateElement(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}
			}
		}
	}
	
	private static void useLinkedHashSet(String[] arr) {
		LinkedHashSet<String> temp = new LinkedHashSet<String>(Arrays.asList(arr));
		String[] result = temp.toArray(new String[] {});
		System.out.println(String.join(", ", result));
	}

	private static void useTemporaryArray(Integer[] arr) {
		Integer[] tempArray = new Integer[arr.length];
		int j = 0;
		for (int i = 0; i < tempArray.length - 1; i++) {
			Integer currentElement = arr[i];
			if (currentElement != arr[i + 1]) {
				tempArray[j++] = currentElement;
			}
		}
		tempArray[j++] = arr[arr.length - 1];
		System.out.println(Arrays.toString(tempArray));
	}

	private static void useSeparateIndex(Integer[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[arr.length - 1];
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void arrayElementsAreNotSorted(Integer[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				arr[i] = null;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		String[] names = { "Amin", "Aman", "Aman", "Aman", "Arul" };
		Integer[] numbers = new Integer[] { 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8 };

//		printDuplicateElement(names);
		useLinkedHashSet(names);
		
		useTemporaryArray(numbers);
//		useSeparateIndex(numbers);
		arrayElementsAreNotSorted(numbers);
	}
}