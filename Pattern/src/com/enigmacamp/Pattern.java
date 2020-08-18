package com.enigmacamp;

import java.util.Scanner;

public class Pattern {
	public static void printNumberPyramid(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		for (int i = number-1; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Input number : ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		printNumberPyramid(input);
	}
}