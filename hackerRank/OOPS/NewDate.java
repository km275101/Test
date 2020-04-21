package OOPS;

import java.time.LocalDate;
import java.util.Calendar;

public class NewDate {
	
	 public static String findDay(int month, int day, int year) {
		 
		 	LocalDate ld = LocalDate.of(year, month, day);
		 	return ld.getDayOfWeek().toString();
		 	
	    }

	public static void main(String[] args) {
		
		String s =findDay(10, 10, 2001);
		System.out.println(s);
	}

}
