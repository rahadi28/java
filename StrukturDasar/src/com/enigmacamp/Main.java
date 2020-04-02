package com.enigmacamp;

import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;
import com.enigmacamp.vehicle.Car;
import com.enigmacamp.vehicle.Motorcycle;
import com.enigmacamp.vehicle.Train;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World...!!!");

		Car.numberOfWheels();
		Motorcycle.numberOfWheels();
		Train.numberOfWheels();

		Date today = new Date();
		System.out.println("Hari ini = " + today);
		Date tomorrow = DateUtils.addDays(today, 1);
		System.out.println("Besok = " + tomorrow);
	}
}