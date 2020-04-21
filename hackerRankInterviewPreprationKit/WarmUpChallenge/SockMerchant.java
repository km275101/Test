package WarmUpChallenge;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant { 
	
    static int sockMerchant(int n, int[] ar) {
    	int count =0 ;
    	Map<Integer, Integer> m = new HashMap<Integer, Integer>();
    	
    	for(int i : ar) {
    		if(m.containsKey(i)) {
    			m.put(i, m.get(i)+1);
    		}else {
    			m.put(i, 1);
    		}
    	}
    	
    	for(Integer k : m.values()) {
    		if(k/2 > 0) {
    			count = count + (k/2);
    		}
    	}
		return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    
        int[] ar = {1,1,3,1,2,1,3,3,3,3};
        int n =10;
    

        int result = sockMerchant(n, ar);
        System.out.println(result);

     //   bufferedWriter.write(String.valueOf(result));
   ////     bufferedWriter.newLine();

      //  bufferedWriter.close();

        scanner.close();
    }
    
}
