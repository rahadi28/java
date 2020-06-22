package com.enigmacamp.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import com.enigmacamp.model.Student;
import com.enigmacamp.service.StudentService;

public class Main {
	private void startOne() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Input student id : ");
		Integer input = scan.nextInt();
		Student std = StudentService.getStudentById(input);

		if (std != null) {
			System.out.println(std.getId());
			System.out.println(std.getName());
			System.out.println(std.getBirthPlace());
			System.out.println(std.getBirthDate());
			System.out.println(std.isGender());
		} else {
			System.out.println("Student not found...");
		}
	}

	private void startTwo() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Input student gender : ");
		boolean input = scan.nextBoolean();
		List<Student> stdList = StudentService.getStudentByGender(input);
		System.out.println(stdList);

		if (stdList.size() != 0) {
			for (int i = 0; i < stdList.size(); i++) {
				System.out.println(stdList.get(i).getId());
				System.out.println(stdList.get(i).getName());
				System.out.println(stdList.get(i).getBirthPlace());
				System.out.println(stdList.get(i).getBirthDate());
				System.out.println(stdList.get(i).isGender());
			}
		} else {
			System.out.println("Student not found...");
		}
	}
	
	private void startThree() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Input name\t\t: ");
		String name = scan.nextLine();
		System.out.print("Input birth place\t: ");
		String birthPlace = scan.nextLine();
		System.out.print("Input birth date (ex: 1994-03-28)\t: ");
		String birthDate = scan.nextLine();
		System.out.print("Input gender (true or false)\t\t: ");
		String gender = scan.nextLine();
		
		Date utilDate = null;
		try {
			utilDate = new SimpleDateFormat("yyyy-MM-dd").parse(birthDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

		boolean utilBoolean = Boolean.valueOf(gender);
				
		Student std = new Student();
		std.setName(name);
		std.setBirthPlace(birthPlace);
		std.setBirthDate(sqlDate);
		std.setGender(utilBoolean);
		
		StudentService.addStudent(std);
	}

	public static void main(String[] args) {
		Main app = new Main();
//		app.startOne();
//		app.startTwo();
		app.startThree();
	}
}