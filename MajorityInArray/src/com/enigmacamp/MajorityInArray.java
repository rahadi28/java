package com.enigmacamp;

public class MajorityInArray {
	private static String majorityElement(int[] numList) {
		String result = null;
		try {
			int maxCount = 0;
			int index = -1; // sentinels
			for (int i = 0; i < numList.length; i++) {
				int count = 0;
				for (int j = 0; j < numList.length; j++) {
					if (numList[i] == numList[j]) {
						count++;
					}
				}
				if (count > maxCount) {
					maxCount = count;
					index = i;
				}
			}
			if (maxCount > numList.length / 2) {
				result = Integer.toString(numList[index]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			result = "No majority element";
		}
		return result;
	}

	public static void main(String[] args) {
		int[] numList = { 1, 3, 3, 4, 1, 1 };
		System.out.println(majorityElement(numList));
	}
}