package com.enigmacamp.readfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileAsString {
	
	public static void readFileAsString(String fileName) {
		try {
			String data = "";
			data = new String(Files.readAllBytes(Paths.get(fileName)));
			System.out.println(data);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}