package Arrays;

import java.io.IOException;
import java.util.Scanner;

/*
 * There are 16  hourglasses in A, and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
 * 
 * */
public class DS2DArrays {
    static int hourglassSum(int[][] arr) {
    	int max = -999; // in case all numbers are negative in 2d array
    	
    	for(int i =0 ; i<4; i++) {
    		for(int j =0 ; j<4; j++) {
    			
    			int first = arr[i][j]+arr[i][j+1]+arr[i][j+2];
    			int mid = arr[i+1][j+1];
    			int last = arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
    			
    			int sum = first+ mid + last;
    			if (sum> max) {
    				max = sum ;
    			}
    		}
    	}
    	
		return max;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);
        scanner.close();
    }

}
