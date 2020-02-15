package com.enigmacamp;

public class EncryptString {
	private static String encript(String str, int i) {
		String result = "";
		char[] c = str.toCharArray();
		
		for (int j = 0; j < c.length; j++) {
			int nomor = letterToAlphabetPos(c[j]);
			result = result + toAlphabetic(i + nomor - 1);
		}
		
		return result;
	}

	private static int letterToAlphabetPos(char letter) {
		return Character.toUpperCase(letter) - 64;
	}

	public static String toAlphabetic(int i) {
		if (i < 0) {
			return "-" + toAlphabetic(-i - 1);
		}

		int quot = i / 26;
		int rem = i % 26;
		char letter = (char) ((int) 'A' + rem);
		
		if (quot == 0) {
			return "" + letter;
		} else {
			return toAlphabetic(quot - 1) + letter;
		}
	}

	public static void main(String[] args) {
		System.out.println(encript("dcd", 1).toLowerCase());
	}
}