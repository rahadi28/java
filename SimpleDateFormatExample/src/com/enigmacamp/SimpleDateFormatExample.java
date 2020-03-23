package com.enigmacamp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class SimpleDateFormatExample {
	private static void dateFormat() {
		Locale locale = new Locale("in", "ID");
		System.out.println(locale.toLanguageTag().replace('-', '_'));
		DateFormat getDate = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		DateFormat getTime = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
		String date = getDate.format(new Date());
		String time = getTime.format(new Date());
		System.out.println(date);
		System.out.println(time);
	}

	private static void simpleDateFormat() throws ParseException {
//		String pattern = "MM-dd-yyyy";
		String pattern = "HH:mm:ss";
//		String pattern = " HH:mm:ss.SSSZ";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		String date = sdf.format(new Date());
//		System.out.println(date);
		
//		Date date = sdf.parse("12-01-2018");
		Date date = sdf.parse("22:00:03");
		System.out.println(date);
		
		String pat = "EEEEE MMMMM yyyy HH:mm:ss.SSSZ";
		SimpleDateFormat simpleDateFormat =new SimpleDateFormat(pat, new Locale("in", "ID"));
		String d = simpleDateFormat.format(new Date());
		System.out.println(d);
	}

	private static String dayName(String inputDate, String inputPattern) {
		Locale id = new Locale("in", "ID");
		SimpleDateFormat sdf = new SimpleDateFormat(inputPattern);
		Date date = null;
		try {
			date = sdf.parse(inputDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new SimpleDateFormat("EEEE", id).format(date);
	}
	
	public static void main(String[] args) throws ParseException {
		dateFormat();
		simpleDateFormat();
		System.out.println(dayName("2019-10-23", "yyyy-MM-dd"));
		System.out.println(dayName("2015-03-05 00:00:00", "YYYY-MM-DD HH:MM:ss"));
		
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd");
		String datestr = sdf.format(new Date());
		System.out.println(datestr);
		
		System.out.println(new Date());
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		System.out.println(new SimpleDateFormat("EEEE").format(new Date()));
		
		SimpleDateFormat formatIncoming = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		SimpleDateFormat formatOutgoing = new SimpleDateFormat("yyyy-MM-dd");
		TimeZone tz = TimeZone.getTimeZone("Asia/Jakarta");
		System.out.println(tz.getDisplayName(false, TimeZone.SHORT, Locale.ENGLISH)); // WIB

		formatOutgoing.setTimeZone(tz);
		String s = formatOutgoing.format(formatIncoming.parse("Tue Mar 03 00:00:00 WIB 2015"));
		System.out.println("Date in Indonesia: " + s); // 2015-03-03
	}
}