package Java30Days;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calc implements AdvancedArithmetic {
	int temp = 1;

	public int divisorSum(int n) {

		if (n == 1) {
			return 1;
		} else {

			for (int i = 2; i <= n / 2; i++) {

				if (n % i == 0) {

					temp = temp + i;

				}

			}

		}
		temp = temp + n;
		return temp;
	}
}

class Interfaces {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calc();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}
}
