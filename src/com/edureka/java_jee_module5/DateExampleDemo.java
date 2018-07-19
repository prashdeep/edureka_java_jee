package com.edureka.java_jee_module5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExampleDemo {
	public static void main(String[] args) {
		
		Date currentDate = new Date();
		Calendar instance = Calendar.getInstance();
		
		DateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:MM:ss EEEEE zzzzz"); 
		System.out.println(formatter.format(currentDate));
		
		instance.add(Calendar.DATE, 3);
		System.out.println(instance.get(Calendar.DAY_OF_YEAR));
		System.out.println(formatter.format(instance.getTime()));

	}
}
