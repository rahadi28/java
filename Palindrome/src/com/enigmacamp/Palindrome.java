package com.enigmacamp;

public class Palindrome {
	private static void isPalindrome(int number) {
		int r;
		int sum = 0;
		int temp;
		
		temp = number;
		
		while (number > 0) {
			r = number % 10;
			sum = (sum * 10) + r;
			number = number / 10;
		}
		
		if (temp == sum) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not palindrome");
		}
	}
	
	private static void isPalindrome(String word) {
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome word");
		} else {
			System.out.println("Not palindrome");
		}
	}
	
	public static void main(String[] args) {
		isPalindrome(454);
		isPalindrome("katak");
	}
}