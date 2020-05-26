package Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation1(int n, int[][] queries) { int[] ar =new int[n];
    int max = 0;
    int s = queries.length;
    for(int r = 0; r < s; r++ ) {
        
        
            
            int start = queries[r][0];
            int end = queries[r][1];
            int noToBeAdd = queries[r][2];
            
            for(int k = start-1; k < end; k++ ) {
                ar[k] =+ noToBeAdd;
                if(ar[k] > max) {
                	max = ar[k];
                }
            }
            
    }
    
    
    return max;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);
        

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }
        //int l = queries.length;
        System.out.println();
        long result = arrayManipulation1(n, queries);
        
       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedWriter.close();

        scanner.close();
    }
}
