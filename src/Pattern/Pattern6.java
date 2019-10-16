package Pattern;

import java.util.Scanner;

public class Pattern6 {

	/**
	 * Pattern5 ------------------
	  	 *
	     **
	     ***
	     ****
	     *****
	     ****
	     ***
	     **
	     *
	 * -----------------------
	 */

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int k = n+1; k <= 2*n-1; k++) {
			for (int l = 2*n-1; l >= k; l--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
