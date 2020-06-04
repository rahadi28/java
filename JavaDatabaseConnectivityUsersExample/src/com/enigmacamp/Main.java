package com.enigmacamp;

import java.util.List;
import java.util.Scanner;

import com.enigmacamp.model.User;
import com.enigmacamp.service.UserService;

public class Main {
	private void startOne() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input user id : ");
		Integer input = scan.nextInt();
		User user = UserService.getUserById(input);

		if (user != null) {
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println(user.getPhoneNumber());
			System.out.println(user.isGender());
		} else {
			System.out.println("User not found...");
		}
	}

	private void startTwo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input user gender : ");
		boolean input = scan.nextBoolean();
		List<User> user = UserService.getUsersByGender(input);

		for (int i = 0; i < user.size(); i++) {
			System.out.println(user.get(i).getId());
			System.out.println(user.get(i).getName());
			System.out.println(user.get(i).getEmail());
			System.out.println(user.get(i).getPhoneNumber());
			System.out.println(user.get(i).isGender());
		}
	}

	public static void main(String[] args) {
		Main app = new Main();
		app.startOne();
		app.startTwo();
	}
}