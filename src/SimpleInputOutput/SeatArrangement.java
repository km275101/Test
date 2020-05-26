package SimpleInputOutput;

import java.util.Scanner;

public class SeatArrangement {
	
	static void oppositeSeat(int n) {
		int seatNo ;
		int r = n %6;
		int q = n/6;
		
		if(n%12 >= 6) {
			seatNo = 6*q - (r-1);
		}else {
			if(n < 6) {
				
				seatNo = 12 - (r-1);
			}
			else if(n % 12 == 0) {
				seatNo = n - 11;
			}else {
			seatNo = 6*(q+1) + (r-1);
			}
		}
		
		System.out.println(seatNo);
		
	}
	
	
	static void oppositeSeatUsingLoop(int n) {
		int r = n%12;
		int seat = 0;
		if(r<=1 || r == 6 || r ==7) {
			if(r==0) {
				seat = n -11;
			}else if(r == 1) {
				seat = n +11;
			}else if(r == 6) {
				seat = n +1;
			}else {
				seat = n -1;
			}
			System.out.print(seat+" ");
			System.out.println("WS");
		}else if(r == 2 || r == 11 || r == 5 || r ==8){

			if(r==2) {
				seat = n +9;
			}else if(r == 11) {
				seat = n -9;
			}else if(r ==5) {
				seat = n +3;
			}else {
				seat = n -3;
			}
			System.out.print(seat+" ");
			System.out.println("MS");
		
		}else {
			if(r==3) {
				seat = n +7;
			}else if(r == 10) {
				seat = n -7;
			}else if(r == 4) {
				seat = n +5;
			}else {
				seat = n -5;
			}
			
			System.out.print(seat+" ");
			System.out.println("AS");
		
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int[] arr = new int[T];
		for(int i=0; i<T; i++) {
			 arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			oppositeSeatUsingLoop(arr[i]);
		}
		
		sc.close();
	}

}
