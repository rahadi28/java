package com.enigmacamp.createwritefile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void writeFile() {
		try {
			FileWriter myWriter = new FileWriter("createfile.txt");
			myWriter.write("Files in Java might be tricky, but it is fun enough!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
			
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}