package Arrays;

import java.io.IOException;
import java.util.Scanner;

public class MinimumSwpas {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i+1) continue;
            count++;
            int tmp = arr[i];
            arr[i] = arr[tmp-1];
            arr[tmp-1] = tmp;
            i--;
        }
        return count;
    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] arr = {6,7,2,5,1,3,4};
        int res = minimumSwaps(arr);
        System.out.println(res);
        scanner.close();
        
    }
}
