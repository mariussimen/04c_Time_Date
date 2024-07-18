package com.cc.java;

// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.Month;

import java.time.*;
import java.util.Calendar;

public class App {

	public static void main(String[] args) {
		
		output("---------- Datum / outputn --------------------");
		
		// // aktuelle Datum
		// LocalDate today = LocalDate.now();
		// output("Heutiges Datum: " + today);
		
		// // bestimmtes Datum
		// LocalDate givenDate = LocalDate.of(2012, Month.SEPTEMBER, 21);
		// output("Bestimmtes Datum: " + givenDate);
		
		// // nächste Woche
		// LocalDate aWeekFromToday = today.plusWeeks(1);
		// output("Datum in einer Woche: " + aWeekFromToday);
		
		// // gestern
		// LocalDate yesterday = today.minusDays(1);
		// output("Gestern: " + yesterday);		
	
		
		output("---------- Vergleiche --------------------");
		
		// output("Schaltjahr?: " + givenDate.isLeapYear() );
		// output("Heute/Gestern: " + today.isAfter(yesterday) );
		// output("Gestern/Heute: " + yesterday.isBefore(today));
		// output("heute/heute: " + today.isEqual(yesterday));
		

		output("---------- Extraktion --------------------");
	
		// int year = today.getYear();
		// output("aktuelles Jahr: " + year );
		
		// givenDate = LocalDate.of(2020, Month.OCTOBER, 9);		
		// String weekday = givenDate.getDayOfWeek().name();
		// output("Wochentag: " + weekday );
		// output("Thank God it's " + weekday );
		// output("Tag im Monat: " + today.getDayOfMonth());
		
		output("---------- Zeit / outputn --------------------");
		
		// LocalTime justNow = LocalTime.now();
		// output("Jetzt: " + justNow );
		
		// LocalTime newTime = LocalTime.of(12, 00);
		// output("Mittag: " + newTime );
		
		// LocalTime inOneHour = justNow.plusHours(1);
		// output("In einer Stunde: " + inOneHour );
		
		output("---------- Extraktion --------------------");
		
		// int hour = justNow.getHour(); // hora
		// output("H: " + hour );
		
		// int minute = justNow.getMinute();
		// output("MIN: " + minute );
		
		output("---------- DateTime --------------------");
		
		// LocalDateTime timeStamp = LocalDateTime.now();
		// output("timeStamp: " + timeStamp );
		
		// System.out.println("---------- Kalenderwoche --------------------");
		
        // Calendar cal = Calendar.getInstance();
        // output("Kalenderwoche: " + cal.get(Calendar.WEEK_OF_YEAR)); 

	}

	public static void output(String outputStr) {
		System.out.println(outputStr);  
	  }

}
