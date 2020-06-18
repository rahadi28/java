package com.enigmacamp.deletefile;

import java.io.File;

public class DeleteFile {

	public static void deleteFile() {
		File myObj = new File("createfile.txt");
		
		if (myObj.delete()) {
			System.out.println("Deleted the file: " + myObj.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}
	}
}