package com.enigmacamp;

public class ArrayProperties {
	public static void main(String[] args) {
		String[] arrString = new String[] {"A", "B", "C", "D", "E", "F"};
		String[] arrTemp = arrString;
		
		arrString = new String[] {"Abdul", "Basri", "Cendol", "Dodol", "Eko", "Farhan"};
		arrString[0] = "Alpukat";
		
		System.out.println(arrString[0]);
		System.out.println(arrTemp[0]);
		
		String str = "Enigmacamp";
		char[] arrChar = str.toCharArray();
		
		System.out.println(arrChar.length);
		System.out.println(arrChar[0]);
		System.out.println(arrChar[1]);
		System.out.println(arrChar[2]);
		System.out.println(arrChar[3]);
		System.out.println(arrChar[4]);
		System.out.println(arrChar[5]);
		System.out.println(arrChar[6]);
		System.out.println(arrChar[7]);
		System.out.println(arrChar[8]);
		System.out.println(arrChar[9]);
		
		int[] arrIntFirst = new int[] {1, 2, 3, 4, 5};
		int[] arrIntSecond = arrIntFirst;
		
		System.out.println(arrIntFirst[0]);
		System.out.println(arrIntSecond[0]);
	}
}