package com.enigmacamp;

public class ReverseWord {
	private static String reverseWord(String str) {
		char[] c = str.toCharArray();
		String result = "";
		
		for (int i = c.length - 1; i >= 0; i--) {
			result += c[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseWord("Aku cinta padamu"));
	}
}