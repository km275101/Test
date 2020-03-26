package CommonPrograms;

public class Fibnacci {

	// with recursion
	public static int fibbRec(int n) {
		if (n==0)
			return 0;
		else if(n==1)
			return 1;
		else
		return fibbRec(n - 1) + fibbRec(n - 2);
	}

	// print all the fibnacci series for a given number with iteration
	public static double fibbIterative(int n) {
		int f1 = 0, f2 = 1, f3;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.printf(f1 + " ");
			sum = sum + f1;
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		return sum;
	}

	// using while loop
	public static double fibbUsingWhile(int n) {
		int min = 0;
		int max = 0;
		int temp=1;
		double sum = 0;
		while (n >=1) {
			System.out.print(max+" ");
			sum = sum + max;
			min = max;
			max = temp;
			temp = min + max;
			n--;
		}
		System.out.println(" ");
		System.out.println(sum);
		return sum;
	}

	public static void main(String args[]) {

		System.out.println("printing fibnacci using loop and also calculating the sum :: \r\n ");
		double sum1 = fibbIterative(5);
		System.out.print("\r\n");
		System.out.println(sum1);

		System.out.println("\r\n");
		System.out.println("printing fibnacci using while loop and also calculating the sum ::\r\n ");
		fibbUsingWhile(5);

		System.out.println("\r\n");
		System.out.println("printing fibnacci using recursion and also calculating the sum :: \r\n ");
		double sum2 = 0;
		int maxNumber = 5;
		for (int i = 0; i < maxNumber; i++) {
			System.out.print(fibbRec(i) + " ");
			sum2 = sum2 + fibbRec(i);
		}
		System.out.print("\r\n");
		System.out.print(sum2);

	}
}
