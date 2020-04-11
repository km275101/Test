package Sorting;

import java.util.Scanner;

//printing the total number of shifts in bubble sort
public class BubbleSort {

	static void bubbleSortDesc(int A[], int size) {

		for (int i = 0; i < size - 1; i++) {

			for (int k = 0; k < size - i - 1; k++) {
				if (A[k] < A[k + 1]) {
					int temp = A[k + 1];
					A[k + 1] = A[k];
					A[k] = temp;
				}

			}

		}
		System.out.println(A.toString());

	}

	static int bubbleSortAsc(int A[]) {
		int size = A.length;
		int counnt = 0;
		for (int i = 0; i < size - 1; i++) {
			for (int k = 0; k < size - i - 1; k++) {
				if (A[k] > A[k + 1]) {
					int temp = A[k + 1];
					A[k + 1] = A[k];
					A[k] = temp;
					counnt++;
				}
			}
		}
		for (int a = 0; a < size; a++) {
			if (a == size - 1) {
				System.out.println(A[a]);
				break;
			}
			System.out.print(A[a] + " ,");
		}
		return counnt;
	}

	
	static void maxMinSumAndTheirDiff(int[] A, int max, int min){
		int noOfElements = max- min;
		double minSum = 0;
		double maxSum = 0;
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
		
		for(int i =0; i < noOfElements; i ++) {
			minSum = minSum + A[i];
		}
		
		for(int i =size - noOfElements; i< size; i ++) {
			maxSum = maxSum + A[i];
		}
		
		System.out.println(maxSum - minSum);
		
	}
	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the size : ");
		 * int size = sc.nextInt();
		 * 
		 * int[] array = new int[size]; for(int i=0 ; i< size-1; i++) {
		 * System.out.println("Enter the array number : "); array[i] = sc.nextInt(); }
		 */

		int[] array = { 5,4,3,2,1 };
		//int c = bubbleSortAsc(array);
		//System.out.println(c);
		
		maxMinSumAndTheirDiff(array, 5, 1);

	}

}
