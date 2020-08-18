package com.enigmacamp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaDatabaseConnectivity {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/experiment?serverTimezone=UTC";
	static final String USER = "root";
	static final String PASS = "P@ssw0rd";

	static Connection conn;
	static Statement state;
	static ResultSet rs;

	public static void addHero() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			conn.setAutoCommit(false);
			state = conn.createStatement();

			String sqlInsert = "INSERT INTO hero (name, hp, damage) VALUES ('Arjuna', 100, 50)";
			state.executeUpdate(sqlInsert);
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void editHero() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			conn.setAutoCommit(false);
			state = conn.createStatement();

			String sqlUpdate = "UPDATE hero SET name='Jaka Tarub', hp=300, damage=50 WHERE id=6";
			state.executeUpdate(sqlUpdate);
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void showAll() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			conn.setAutoCommit(false);
			state = conn.createStatement();

			String sqlSelect = "SELECT * FROM hero";
			rs = state.executeQuery(sqlSelect);
			conn.commit();

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

	public static void showByName() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			conn.setAutoCommit(false);
			state = conn.createStatement();

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Input hero's name : ");
			String name = reader.readLine();

			String sqlSelect = "SELECT * FROM hero WHERE name='" + name + "'";
			System.out.println(sqlSelect);
			rs = state.executeQuery(sqlSelect);
			conn.commit();

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

	public static void removeHero() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			conn.setAutoCommit(false);
			state = conn.createStatement();

			String sqlDelete = "DELETE FROM hero WHERE id=7";
			state.executeUpdate(sqlDelete);
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		addHero();
//		editHero();
//		showAll();
//		showByName();
//		removeHero();
	}
}