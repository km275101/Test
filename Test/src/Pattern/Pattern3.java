package Pattern;

import java.util.Scanner;

/**
Pattern2
------------------
   *
  **
 ***
****
-----------------------
*/

public class Pattern3 {
	
	public static void main(String args[]){
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++){

			for(int j = n; j>i; j--){
			
				System.out.print(" ");
				
			}
			for(int k = 1; k<=i; k++){
				
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
