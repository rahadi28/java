package com.enigmacamp.createwritefile;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void createFile() {
		try {
			/* To create a file in a specific directory (requires permission) */
			//File myObj = new File("C:\\Users\\MyName\\filename.txt");  
			
			File myObj = new File("createfile.txt");
			
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
			
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}