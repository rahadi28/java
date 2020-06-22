package com.enigmacamp.model;

import java.util.Date;

public class Student {
	private int id;
	private String name;
	private String birthPlace;
	private Date birthDate;
	private boolean gender;

	public Student() {
		super();
	}

	public Student(int id, String name, String birthPlace, Date birthDate, boolean gender) {
		super();
		this.id = id;
		this.name = name;
		this.birthPlace = birthPlace;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
}
