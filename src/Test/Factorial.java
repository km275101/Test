package Test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		//int n = sc.nextInt();
		int n =5;
		double sum = 1;
		while(n>0) {
			sum = sum * n;
			n--;
		}
		System.out.println("Factorial  is : "+sum);
	}

}
