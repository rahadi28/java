package com.enigmacamp;

public class SmallestNumber {
	public static void arraySorting(int[] arr) {
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static int[] removeDuplicate(int[] arr) {
		int counter = 1;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1])
				counter++;
		}
		
		int[] result = new int[counter];
		result[0] = arr[0];
		counter = 1;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1])
				result[counter++] = arr[i];
		}
		return result;
	}

	public static int smallestNumberOutsideArray(int[] arr) {
		int counter = 1;

		for (int i = 0; i < arr.length; i++) {
			if (counter == arr[i]) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		int[] arrOne = { 1, 4, 3, 2, 4, 3, 7 };
		int[] arrTwo = { 4, 3, 2, 4, 3, 7, 9 };

		arraySorting(arrOne);
		arraySorting(arrTwo);

		arrOne = removeDuplicate(arrOne);
		arrTwo = removeDuplicate(arrTwo);

		System.out.println("Smllest number outside of arrOne is : " + smallestNumberOutsideArray(arrOne));
		System.out.println("Smllest number outside of arrTwo is : " + smallestNumberOutsideArray(arrTwo));
	}
}