package com.enigmacamp.readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UseScanner {
	
	public static void useScanner() {
		try {
			File myObj = new File("parking.txt");
			Scanner myReader = new Scanner(myObj);
			
			/* we just need to use \\Z as delimiter */
			myReader.useDelimiter("\\Z");
			System.out.println(myReader.next());

//			while (myReader.hasNextLine()) {
//				String data = myReader.nextLine();
//				System.out.println(data);
//			}

			myReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}