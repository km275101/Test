package Pattern;

import java.util.Scanner;

public class Pattern1 {
	
	/**
	 Pattern1
------------------
*
**
***
****
*****
******
-----------------------
	 */

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int print =1;
		for(int i = 0; i<n; i++){
			for(int j = 0; j<=i; j++){
				
				System.out.print(print);
				
			}
			System.out.println(" ");
		}

	}

}
