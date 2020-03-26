package Pattern;

import java.util.Scanner;

public class Pattern5 {

	/**
	 * Pattern5 ------------------
	  	 *
	    ***
	   *****
	  *******

	 * -----------------------
	 */
	
	
	public static void pattern1(int n) {
		
		for (int i = 0; i <n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			/*for (int l = 1; l <= i; l++) {
				System.out.print("* ");
			}*/
			System.out.println("");
		}
		
	}
	

	public static void main(String[] args) {
		pattern1(5);
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {

				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {

				System.out.print("*");

			}
			for (int l = 2; l <= i; l++) {

				System.out.print("*");

			}
			System.out.println();
		}

	}

}
