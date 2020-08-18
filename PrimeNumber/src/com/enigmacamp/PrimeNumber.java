package com.enigmacamp;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.print("Input number : ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for (int i = input; i >= 1; i--) {
			int counter = 0;
			
			if (i == 1) {
				System.out.println(i + " is not prime");
				continue;
			} else {
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						counter += 1;
					}
				}
			}
			
			if (counter == 2) {
				System.out.println(i + " is prime");
			} else {
				System.out.println(i + " is not prime");
			}
		}
	}
}