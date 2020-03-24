package com.enigmacamp.readfile;

import java.io.FileReader;
import java.io.IOException;

public class UseFileReader {
	
	public static void useFileReader() {
		try {
			FileReader fr = new FileReader("parking.txt");
			int i;
			
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			
			fr.close();
			
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}