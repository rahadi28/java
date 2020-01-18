package com.enigmacamp;

import java.util.Scanner;

public class StringComparison {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan string 1 panjangnya antara 5-20 karakter : ");
		String strFirst = scan.nextLine();
		System.out.print("Masukan string 2 panjangnya antara 5-20 karakter : ");
		String strSecond = scan.nextLine();
		
		if (strFirst.equalsIgnoreCase(strSecond)) {
			System.out.println("String 1 sama dengan String 2");
		} else {
			System.out.println("String 1 tidak sama dengan String 2");
		}
		
		int lengthStrFirst = strFirst.length();
		int lengthStrSecond = strSecond.length();
		
		if ((lengthStrFirst >= 5 && lengthStrFirst <= 20) && (lengthStrSecond >= 5 && lengthStrSecond <= 20)) {
			System.out.println("Panjang karakter String 1 : "+ lengthStrFirst);
			System.out.println("Panjang karakter String 2 : "+ lengthStrSecond);
		} else {
			System.out.println("Masukan string 1 panjangnya antara 5-20 karakter !!!");
		}
		
		if (lengthStrFirst == lengthStrSecond) {
			System.out.println("String 1 sama dengan String 2");
		} else {
			System.out.println("String 1 tidak sama dengan String 2");
		}
	}
}