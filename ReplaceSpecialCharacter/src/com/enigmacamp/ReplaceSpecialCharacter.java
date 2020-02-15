package com.enigmacamp;

public class ReplaceSpecialCharacter {
	private static void replaceSpecialChar(String str) {
		System.out.println(str.replaceAll("[^a-zA-Z0-9^.,]", " "));
	}

	public static void main(String[] args) {
		replaceSpecialChar("#SE!MARA{|NG-J@MB!.");
	}
}