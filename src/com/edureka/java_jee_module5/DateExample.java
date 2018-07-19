package com.edureka.java_jee_module5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	
	public static void main(String[] args) throws ParseException {
		Date todayDate = new Date();
		Calendar calendar  = Calendar.getInstance();
		calendar.setTime(todayDate);
		calendar.add(Calendar.DAY_OF_MONTH, 4);
		System.out.println("Calendar day of the month is "+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Calendar week of the month is "+calendar.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Day of the week "+calendar.get(Calendar.DAY_OF_WEEK));;
		System.out.println("The month is "+calendar.get(Calendar.MONTH));
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("yy-MM-dd");
		
		//System.out.println(todayDate);
		System.out.println(formatter.parse("18-06-24"));
	}

}
