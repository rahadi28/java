package com.enigmacamp;

public class Utility {
	public static String convertTocamelCase(String str) {
		int i = str.indexOf("_");
		String a = str.substring(i + 1);
		String b = str.substring(0, i);
		String c = a.substring(0, 1).toUpperCase();
		String d = a.substring(1);
		return b + c + d;
	}
}