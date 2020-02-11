package com.enigmacamp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ApplicationFile {
	public static void writeFile() { // This is function for write file to dot.txt
		File file = new File("file.txt"); // Create file.txt
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(file, false);
			bw = new BufferedWriter(fw);
			bw.append("This is testing write file with append\r\n");
			bw.write("This is testing write file 1\r\n");
			bw.write("This is testing write file 2");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (fw != null) {
				try {
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void readFile() { // This is function for read file
		File file = new File("file.txt"); // File to read
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String content = br.readLine();
			while (content != null) {
				System.out.println(content);
				content = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (fr != null) {
				try {
					fr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void writeFileToCSV() throws IOException {
		// Our example data
		List<List<String>> rows = Arrays.asList(
					Arrays.asList("Akai", "100", "10"),
					Arrays.asList("Alucard", "90", "20"),
					Arrays.asList("Saber", "80", "30"),
					Arrays.asList("Rafaela", "70", "40"),
					Arrays.asList("Miya", "60", "50")
				);

		FileWriter fw = new FileWriter("new.csv");
		fw.append("Hero");
		fw.append(",");
		fw.append("HP");
		fw.append(",");
		fw.append("Damage");
		fw.append("\n");

		for (List<String> row : rows) {
			fw.append(String.join(",", row));
			fw.append("\n");
		}

		fw.flush();
		fw.close();
	}

	public static void main(String[] args) throws IOException {
		writeFile();
		readFile();
		writeFileToCSV();
	}
}