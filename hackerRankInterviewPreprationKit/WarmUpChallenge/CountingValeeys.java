package WarmUpChallenge;

import java.io.IOException;
import java.util.Scanner;

public class CountingValeeys {
	


    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	
    	int seaLevelDown = 0;
    	int valleyCount = 0;
    	char[] ch = s.toCharArray();
    	
    	for(Character c : ch) {
    		if (c == 'D') {
    			seaLevelDown--;
    		}else {
    			if(seaLevelDown<0) {
    				seaLevelDown++;
    				if(seaLevelDown == 0) {
    					valleyCount++;
    				}
    			}else {
    				seaLevelDown++;
    			}
    		}
    	
    	}
    	
		return valleyCount;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

      /*  bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
	
}
