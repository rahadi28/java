package com.enigmacamp;

public class Main {
	public static void main(String[] args) {
		Hero wirosableng = new Hero("Wiro Sableng", 100, 30);
		Hero gatotkaca = new Hero("Gatot Kaca", 100, 25);
		Tower tower = new Tower(80);

		System.out.println(wirosableng.print());
		System.out.println(gatotkaca.print());
		System.out.println(tower.print());

		wirosableng.attack(gatotkaca);
		wirosableng.attack(tower);

		System.out.println(wirosableng.print());
		System.out.println(gatotkaca.print());
		System.out.println(tower.print());
	}
}