package com.enigmacamp;

public class BinaryToDecimal {
	private static int getDecimal(int binary) {
		int decimal = 0;
		int i = 0; //counter index of element binary number
		while (true) {
			if (binary == 0) {
				break;
			} else {
				int num = binary % 10; //to get element of binary number 1 or 0
				decimal += num * Math.pow(2, i);
				binary = binary / 10; //divide binary number until 0
				i++;
			}
		}
		return decimal;
	}

	public static void main(String[] args) {
		System.out.println("Decimal of 1101110011 is: " + getDecimal(1101110011));
	}
}