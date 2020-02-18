package com.enigmacamp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class AgeDaysCalculation {
	private static int ageDaysCalculation(String inputDoB) {
		int result = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date d = sdf.parse(inputDoB);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH) + 1;
			int date = c.get(Calendar.DATE);
			LocalDate dob = LocalDate.of(year, month, date);
			LocalDate now = LocalDate.now();
			long days = ChronoUnit.DAYS.between(dob, now);
			result = (int) days;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}

	private static void ageDaysCalc(String inputDoB) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date d = sdf.parse(inputDoB);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH) + 1;
			int date = c.get(Calendar.DATE);
			LocalDate dob = LocalDate.of(year, month, date);
			LocalDate now = LocalDate.now();
			Period p = Period.between(dob, now);
			int ageYear = p.getYears();
			int ageMonth = p.getMonths();
			int ageDay = p.getDays();
			String message = "Your age is " + ageYear + " years " + ageMonth + " months " + ageDay
					+ " days, You are a ";
			if (ageYear < 5) {
				System.out.println(message + "infant");
			} else if (ageYear >= 5 && ageYear < 17) {
				System.out.println(message + "kids");
			} else if (ageYear >= 17 && ageYear <= 28) {
				System.out.println(message + "teenager");
			} else if (ageYear > 28) {
				System.out.println(message + "adult");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private static int simple(String in) {
		String[] str = in.split("/");
		Calendar cal = Calendar.getInstance();
		Date today = cal.getTime();
		cal.set(Integer.parseInt(str[2]), Integer.parseInt(str[1]) - 1, Integer.parseInt(str[0]));
		Date birthday = cal.getTime();
		long dateSubtract = today.getTime() - birthday.getTime();
		long time = 1000 * 60 * 60 * 24;
		int result = (int) (dateSubtract / time);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(ageDaysCalculation("25/12/1992"));
		ageDaysCalc("25/12/1992");
		System.out.println(simple("25/12/1992"));
	}
}