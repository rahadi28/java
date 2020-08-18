package com.enigmacamp;

import java.util.Scanner;

public class IntegerNumbers {
	public static void main(String[] args) {
		int iPositive = 15;
        int iNegative = ( ~(iPositive - 1) ) ; // Use extra brackets when using as C preprocessor directive ! ! !...
        System.out.println(iNegative);

        iPositive =  ~(iNegative - 1)  ;
        System.out.println(iPositive);

        iNegative = 0;
        iPositive = ~(iNegative - 1);
        System.out.println(iPositive);
        
        System.out.println("Input number : ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        
        if (input % 2 == 1) {
			System.out.println("Positive odd integers");
		} else if (input % 2 == -1) {
			System.out.println("Negative odd integers");
		} else if (input > 0) {
			System.out.println("Positive even integers");
		} else {
			System.out.println("Negative even integers");
		}
	}
}