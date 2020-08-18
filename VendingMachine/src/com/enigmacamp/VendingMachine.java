package com.enigmacamp;

public class VendingMachine {
	private static String processing(String rawMoney) {
		String[] moneys = rawMoney.split(" ");
		int total = 0;

		for (int i = 0; i < moneys.length; i++) {
			if (Integer.valueOf(moneys[i]) != 2000 && Integer.valueOf(moneys[i]) != 5000) {
				return "Fractions of money not accepted!!!";
			} else {
				total += Integer.valueOf(moneys[i]);
			}
		}

		if (total >= 9000) {
			return "Susu Jahe";
		} else if (total >= 7000) {
			return "Kopi Susu";
		} else if (total >= 5000) {
			return "Teh Madu";
		} else {
			return "Ampas Kopi";
		}
	}

	public static void main(String[] args) {
		System.out.println(processing("5000 2000"));
	}
}