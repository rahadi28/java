package com.enigmacamp;

public class Main {
	public static void main(String[] args) {
		/* if variable modifier public */
//		Student.name = "Rahadi";
//		Student.address = "Bogor";
//		Student.birthPlace = "Bedayan";
		
		/* if variable static */
//		Student.setName("Rahadi");
//		Student.setAddress("Bogor");
//		Student.setBirthPlace("Bedayan");

		Student std = new Student();
		std.setName("Rahadi Oemar");
		std.setAddress("Kota Bogor");
		std.setBirthPlace("Desa Bedayan");

		System.out.println(std.getName());
		System.out.println(std.getAddress());
		System.out.println(std.getBirthPlace());
	}
}