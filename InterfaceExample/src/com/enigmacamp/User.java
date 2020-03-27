package com.enigmacamp;

public class User {
	private Phone phone;

	public User(Phone phone) {
		this.phone = phone;
	}

	void turnOnThePhone() {
		this.phone.powerOn();
	}

	void turnOffThePhone() {
		this.phone.powerOff();
	}

	void makePhoneLouder() {
		this.phone.volumeUp();
	}

	void makePhoneSilent() {
		this.phone.volumeDown();
	}
}