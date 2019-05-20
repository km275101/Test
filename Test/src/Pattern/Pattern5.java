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

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {

				System.out.print(" ");

			}
			for (int k = 1; k <= i+count; k++) {

				System.out.print("*");

			}
			count = count+1;
			System.out.println();
		}

	}

}
