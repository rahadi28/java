package com.enigmacamp;

public class BinaryToDecimal {
	private static int getDecimal(int binary) {
		int decimal = 0;
		int n = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				int temp = binary % 10;
				decimal += temp * Math.pow(2, n);
				binary = binary / 10;
				n++;
			}
		}
		return decimal;
	}

	public static void main(String[] args) {
		System.out.println("Decimal of 1101110011 is: "+getDecimal(1101110011));
	}
}