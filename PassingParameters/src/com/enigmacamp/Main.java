package com.enigmacamp;

import java.util.Arrays;

public class Main {
	private static void updateNumber(Integer number) {
		number += 10;
	}

	private static void updateName(String name) {
		name += " updated";
	}

	private static void updateNames(String[] names) {
		names[0] += " updated";
		names[1] += " updated";
	}

	private static void updateName(Student student) {
		student.setName(student.getName() + " updated");
	}

	public void print(Student student) {
		Main app = new Main();
		System.out.println(app);
		System.out.println(student);
	}

	public static void main(String[] args) {
		Integer number = 10;
		updateNumber(number);
		System.out.println(number);

		String name = "Rahadi";
		updateName(name);
		System.out.println(name);

		String[] listName = { "Rahadi", "Oemar" };
		updateNames(listName);
		System.out.println(Arrays.toString(listName));

		Student std = new Student("Rahadi", true, 25);
		updateName(std);
		System.out.println(std.getName());

		Main app = new Main();
		app.print(std);
	}
}