package com.enigmacamp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gender")
public class Gender {
	@Id
	@Column(name = "gender_code")
	private String genderCode;

	@Column(name = "gender_name")
	private String genderName;

	public Gender() {
		super();
	}

	public Gender(String genderCode, String genderName) {
		super();
		this.genderCode = genderCode;
		this.genderName = genderName;
	}

	public String getGenderCode() {
		return genderCode;
	}

	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}

	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}
}