package com.enigmacamp.readfile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFileIntoList {
	
	public static void readFileIntoList(String fileName) {
		try {
			List<String> lines = Collections.emptyList();
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
			Iterator<String> itr = lines.iterator();
			
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}