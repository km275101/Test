package BubbleSort;

import java.util.Scanner;

class EasyGoing {

	// difference between maximum sum and minimum sum of N-M elements

	static void maxMinSumAndTheirDiff(int[] A, int max, int min) {
		int noOfElements = max - min;
		int minSum = 0;
		int maxSum = 0;
		int size = A.length;
		for (int i = 0; i < size - 1; i++) {
			for (int k = 0; k < size - i - 1; k++) {
				if (A[k] > A[k + 1]) {
					int temp = A[k + 1];
					A[k + 1] = A[k];
					A[k] = temp;
				}
			}
		}

		for (int i = 0; i < noOfElements; i++) {
			minSum = minSum + A[i];
		}

		for (int i = size - noOfElements; i < size; i++) {
			maxSum = maxSum + A[i];
		}

		System.out.println(maxSum - minSum);

	}

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		sc.nextLine();

		String[] s = sc.nextLine().split(" ");
		// sc.next();
		int maxNum = Integer.parseInt(s[0]);
		int minNum = Integer.parseInt(s[1]);

		int[] array = new int[maxNum];

		for (int t = 0; t < size; t++) {

			for (int i = 0; i < maxNum; i++) {
				array[i] = sc.nextInt();
			}
			maxMinSumAndTheirDiff(array, maxNum, minNum);
		}

		sc.close();
	}
}
