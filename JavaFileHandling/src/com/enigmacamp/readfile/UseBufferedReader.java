package com.enigmacamp.readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UseBufferedReader {

	public static void useBufferedReader() {
//		try {
//			File file = new File("parking.txt");
//			BufferedReader br = new BufferedReader(new FileReader(file));
//			String st;
//
//			while ((st = br.readLine()) != null) {
//				System.out.println(st);
//			}
//			
//			br.close();
//			
//		} catch (IOException e) {
//			System.out.println("An error occurred.");
//			e.printStackTrace();
//		}
		
//		try (FileReader reader = new FileReader("parking.txt"); BufferedReader br = new BufferedReader(reader)) {
//			String line;
//			
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//
//		} catch (IOException e) {
//			System.err.format("IOException: %s%n", e);
//		}
		
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader("parking.txt");
			br = new BufferedReader(fr);
			String line;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
			
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException ex) {
				System.err.format("IOException: %s%n", ex);
			}
		}
	}
}