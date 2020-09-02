package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	static boolean m1(String s1, String s2) {
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		boolean flag = false;
		if(a.length == b.length) {
			
			Arrays.sort(a);
			Arrays.sort(b);
			
			if(String.valueOf(a).compareTo(String.valueOf(b)) == 0) {
				
				flag = true;
				
			}
		}
		return flag;
		
	}
	
static boolean m2(String s1, String s2) {
		
		char[] a = s1.toLowerCase().toCharArray();
		char[] b = s2.toLowerCase().toCharArray();
		boolean flag = true;
		StringBuilder sb = new StringBuilder(s2.toLowerCase());
		if(a.length == b.length) {
			
			
			for(Character c : a) {
				int index = sb.indexOf(""+c);
				if (index != -1)
                {
					sb = sb.deleteCharAt(index);
				}
				else
                {
                	//If not present, setting status as false and breaking the loop
                	flag = false;
                	break;
                }
			}
			
		}
		else {
			flag = false;
		}
		return flag;
		
	}

	public static void main(String[] args) {
		
		 m2("Silent", "Listen");
		 
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = m2(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		

	}

}
