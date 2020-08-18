package com.enigmacamp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[][] dataStudent = new String[5][3];

		dataStudent[0][0] = "Rahadi";
		dataStudent[0][1] = "Bogor";
		dataStudent[0][2] = "Bedayan";
		dataStudent[1][0] = "Raidah";
		dataStudent[1][1] = "Sintang";
		dataStudent[1][2] = "Tebidah";
		dataStudent[2][0] = "Wulan";
		dataStudent[2][1] = "Sintang";
		dataStudent[2][2] = "Gandis";
		dataStudent[3][0] = "Cici";
		dataStudent[3][1] = "Sintang";
		dataStudent[3][2] = "Menyumbong";
		dataStudent[4][0] = "Astri";
		dataStudent[4][1] = "Sintang";
		dataStudent[4][2] = "Sui Durian";

		System.out.println(dataStudent[0][0]);
		System.out.println(dataStudent[0][1]);
		System.out.println(dataStudent[0][2]);

		System.out.println(Arrays.toString(dataStudent[0]));
		System.out.println(Arrays.toString(dataStudent[1]));
		System.out.println(Arrays.toString(dataStudent[2]));
		System.out.println(Arrays.toString(dataStudent[3]));
		System.out.println(Arrays.toString(dataStudent[4]));

		System.out.println(Arrays.deepToString(dataStudent));

		for (int row = 0; row < dataStudent.length; row++) {
			for (int col = 0; col < dataStudent[row].length; col++) {
				System.out.format("Masukan data siswa (%d,%d): ", row, col);
				dataStudent[row][col] = new Scanner(System.in).nextLine();
			}
		}

		System.out.println(Arrays.deepToString(dataStudent));
	}
}