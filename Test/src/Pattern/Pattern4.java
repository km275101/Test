package Pattern;

import java.util.Scanner;

/**
Pattern2
------------------
15  14  13  12  11  
10  9  8  7  
6  5  4  
3  2  
1  
-----------------------
*/

public class Pattern4 {
	
	public static void main(String args[]){
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter the Count : ");
		int count = sc.nextInt();
		for(int i = 1; i<=n; i++){

			for(int j = n; j >= i; j--){
				System.out.print(count + "  ");
				count--;
				if(count == 1){
					break;
				}
			}
			System.out.println();
		}

	}

}
