package WarmUpChallenge;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheClouds {



    
    static int jumpingOnClouds(int[] c) {
    	int l = c.length;
    	int jump =0;
    	int i = 0;
    	while(i < l) {
    		i += (c[i+2] == 0) ? 2 : 1;
            jump++; 
    	}
    	jump++;
    	
		return jump;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        scanner.close();
    }
	}


