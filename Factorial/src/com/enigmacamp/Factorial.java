package com.enigmacamp;

import java.util.Scanner;

public class Factorial {
	public static void factorial() {
		System.out.print("Input number : ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		long fact = 1;
		
		for (int i = input; i >= 1; i--) {
			fact *= i;
		}
		System.out.println(fact);
	}
	
	public static int factorial(int number) {
		if (number == 1) {
			return number;
		} else {
			return number * factorial(number-1);
		}
	}

	public static void main(String[] args) {
		factorial(); // Call function void factorial()
		System.out.println(factorial(5)); // Call function int factorial(int number)
	}
}