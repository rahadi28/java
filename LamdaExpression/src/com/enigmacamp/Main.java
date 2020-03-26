package com.enigmacamp;

public class Main {

	public static void main(String[] args) {
		String name = "Rahadi";
		
		Button btn = new Button();

		/* membuat class anonymous untuk implementasi interface */
		btn.setClickAction(() -> {
			System.out.println("Tombol sudah diklik!");
			System.out.println("Yay!");
			System.out.println("Hello " + name);
		});

		/* mencoba klik tombol */
		btn.doClick();
	}
}