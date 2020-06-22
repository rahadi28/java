package com.enigmacamp.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.enigmacamp.config.DatabaseConnection;
import com.enigmacamp.model.Student;

public class StudentService {
	public static void addStudent(Student std) {
		try {
			Connection conn = DatabaseConnection.getConnection();
			conn.setAutoCommit(false); // Set Commit to false
			String sql = "INSERT INTO student (name, birth_place, birth_date, gender) values (?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, std.getName());
			ps.setString(2, std.getBirthPlace());
			ps.setDate(3, (Date) std.getBirthDate());
			ps.setBoolean(4, std.isGender());
			int rowsAffected = ps.executeUpdate();
			conn.commit(); // Commit SQL

			if (rowsAffected != 0) {
				System.out.println("Student successfully inserted...");
			} else {
				System.err.println("No student inserted...");
			}
			ps.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Student> getStudentByGender(boolean gender) {
		List<Student> studentList = new ArrayList<Student>();

		try {
			Connection conn = DatabaseConnection.getConnection();
			String sql = "SELECT id, name, birth_place, birth_date, gender FROM student WHERE gender=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setBoolean(1, gender);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Student std = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("birth_place"),
						rs.getDate("birth_date"), rs.getBoolean("gender"));
				studentList.add(std);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return studentList;
	}

	public static Student getStudentById(int id) {
		Student std = null;

		try {
			Connection conn = DatabaseConnection.getConnection();
			String sql = "SELECT id, name, birth_place, birth_date, gender FROM student WHERE id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				std = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("birth_place"),
						rs.getDate("birth_date"), rs.getBoolean("gender"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return std;
	}
}