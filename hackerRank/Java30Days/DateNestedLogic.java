package Java30Days;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class DateNestedLogic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date Actual :: yyyy month date ");
		
		// for fix input
		LocalDate ld = LocalDate.of(2014, Month.JUNE, 2);
		LocalDate ld1 = LocalDate.of(2014, Month.JULY, 5);
		int p = Period.between(ld1, ld).getDays();
		int y = ld.getDayOfYear() - ld1.getDayOfYear();
		
		if(p<=0) {
			System.out.println(0);
		}else if(p<31){
			System.out.println(p*15);
		}else if(p>31 && y == 0) {
			System.out.println(p*500);
		}else {
			System.out.println("10000");
		}
		

	}

}
