package CommonPrograms;

import java.util.Scanner;

public class Fibnacci {
	
	public static void main(String args[]) {
		
		int f1 = 0,f2 = 1,f3;
		int n = 10 ;
		
		// Next 2 lines show how to take input from user
		/*Scanner sc = new Scanner(System.in); 
		System.out.println("You entered integer "+n); 
		int n = sc.nextInt(); */
        
		
		for(int i=1;i<=n;i++) {
	
		
		System.out.println(f1 +",");
		f3 = f1 + f2;
		f1 = f2;
		f2 = f3;
		
	}
	}
}
