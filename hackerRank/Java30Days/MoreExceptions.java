package Java30Days;

import java.util.*;
import java.io.*;

class calculator{
	
	int s;
	public int power(int n, int p) throws Exception{
		
		if(n<0 || p < 0) {
			
			throw new Exception("MoreExceptions");
		}
		else {
			
			s = (int) Math.pow(n, p);
		}
		return s;
		
		
		
	}
	
}

class MoreExceptions{
	

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            try {
            	calculator c = new calculator();
                int ans = c.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

