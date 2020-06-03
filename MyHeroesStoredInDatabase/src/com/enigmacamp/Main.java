package com.enigmacamp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/experiment?serverTimezone=UTC";
	static final String USER = "root";
	static final String PASS = "P@ssw0rd";

	static Connection conn;
	static Statement state;
	static ResultSet rs;
	static PreparedStatement ps;

	public void addHero() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Input hero's name : ");
			String name = reader.readLine();
			System.out.print("Input hero's hp : ");
			String hp = reader.readLine();
			System.out.print("Input hero's damage : ");
			String damage = reader.readLine();
			
			String sqlInsert = "INSERT INTO hero (name, hp, damage) VALUES (?, ?, ?)";
			ps = conn.prepareStatement(sqlInsert);
			ps.setString(1, name);
			ps.setString(2, hp);
			ps.setString(3, damage);
			int rowsAffected = ps.executeUpdate();

			if (rowsAffected != 0) {
				System.out.println("Hero successfully inserted...");
			} else {
				System.err.println("No hero inserted...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editHero() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Input hero's id : ");
			String id = reader.readLine();
			System.out.print("Input hero's name : ");
			String name= reader.readLine();
			System.out.print("Input hero's hp : ");
			String hp = reader.readLine();
			System.out.print("Input hero's damage : ");
			String damage = reader.readLine();

			String sqlUpdate = "UPDATE hero SET name = ?, hp = ?, damage = ? WHERE id = ?";
			ps = conn.prepareStatement(sqlUpdate);
			ps.setString(1, name);
			ps.setString(2, hp);
			ps.setString(3, damage);
			ps.setString(4, id);
			int rowsAffected = ps.executeUpdate();

			if (rowsAffected != 0) {
				System.out.println("Hero successfully updated...");
			} else {
				System.err.println("No hero updated...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showAll() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			state = conn.createStatement();

			String sqlSelect = "SELECT * FROM hero";
			rs = state.executeQuery(sqlSelect);
			
			while (rs.next()) {
				System.out.println("+--------------------------------+");
				System.out.println("Id\t: " + rs.getInt("id"));
				System.out.println("Hero\t: " + rs.getString("name"));
				System.out.println("Hp\t: " + rs.getInt("hp"));
				System.out.println("Damage\t: " + rs.getInt("damage"));
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showByName() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Input hero's name : ");
			String name= reader.readLine();

			String sqlSelect = "SELECT * FROM hero WHERE name LIKE ? ";
			ps = conn.prepareStatement(sqlSelect);
			ps.setString(1, name);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println("+--------------------------------+");
				System.out.println("ID\t: " + rs.getInt("id"));
				System.out.println("Hero\t: " + rs.getString("name"));
				System.out.println("HP\t: " + rs.getInt("hp"));
				System.out.println("Damage\t: " + rs.getInt("damage"));
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removeHero() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Input hero's id : ");
			String id = reader.readLine();

			String sqlDelete = "DELETE FROM hero WHERE id = ?";
			ps = conn.prepareStatement(sqlDelete);
			ps.setString(1, id);
			int rowsAffected = ps.executeUpdate();

			if (rowsAffected != 0) {
				System.out.println("Hero successfully deleted...");
			} else {
				System.err.println("No hero removed...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int printMenuAndGetInput() {
		System.out.println(" _________________________________");
		System.out.println("|            MY HEROES            |");
		System.out.println("|---------------------------------|");
		System.out.println("| 1. Add Hero                     |");
		System.out.println("| 2. Edit Hero                    |");
		System.out.println("| 3. Remove Hero                  |");
		System.out.println("| 4. Show all                     |");
		System.out.println("| 5. Show by name                 |");
		System.out.println("| 6. Exit                         |");
		System.out.println("|_________________________________|\n");
		System.out.print("Input your choice number : ");

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		return input;
	}

	public void start() {
		int input;
		do {
			input = printMenuAndGetInput();
			switch (input) {
			case 1:
				addHero();
				break;
			case 2:
				editHero();
				break;
			case 3:
				removeHero();
				break;
			case 4:
				showAll();
				break;
			case 5:
				showByName();
				break;
			case 6:
				System.out.println("Application has been terminated...\nSee you!!!");
				break;
			default:
				System.err.println("Invalid input!!!\n\n");
			}
		} while (input != 6);
	}

	public static void main(String[] args) {
		Main apps = new Main();
		apps.start();
	}
}