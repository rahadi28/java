package com.enigmacamp;

import java.util.Scanner;

public class OddAndEvenNumber {

	public static void main(String[] args) {
		System.out.print("Input number : ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for (int i = 1; i <= input; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " bilangan ganjil");
			} else {
				System.out.println(i + " bilangan genap");
			}
		}
	}
}