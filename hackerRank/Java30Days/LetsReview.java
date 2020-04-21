package Java30Days;

import java.util.Scanner;

public class LetsReview {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int k=0; k<t; k++) {
			String s = sc.nextLine();
			int n = s.length();
			boolean f = false;
			for(int i= 0; i< n; i++) {
				
				
				if(i%2 == 0) {
					System.out.print(s.charAt(i));
				}
				if(i == n-1) {
					f = true;
					System.out.print(" ");
					for(int j= 0; j< n; j++) {
						
						if(! (j%2 == 0)) {
							System.out.print(s.charAt(j));
						}
					}
					System.out.println();
				}
		}
		
		}
		
	}

}
