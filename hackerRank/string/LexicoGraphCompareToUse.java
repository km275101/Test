package string;

import java.util.Scanner;

/**
 * 
Given two strings of lowercase English letters,A  and B, perform the following operations:

Sum the lengths of  A and B. 
Determine if  A is lexicographically larger than  B(i.e.: does  come before  in the dictionary?).
Capitalize the first letter in A and  B and print them on a single line, separated by a space.

*/

public class LexicoGraphCompareToUse {
	
	public static void m1(String A, String B) {
		
		int a = A.length();
		int b = B.length();
		int c = a+b ;
		System.out.println(c);
		
		if(A.compareTo(B)>0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		StringBuffer sb = new StringBuffer(A);
		String ss = sb.substring(0, 1).toUpperCase()+sb.substring(1);
		
		StringBuffer sb2 = new StringBuffer(B);
		String ss2 = sb2.substring(0, 1).toUpperCase()+sb2.substring(1);
		
		System.out.println(ss+" "+ss2);
		
		
	}
	
public static void m12(String A, String B) {
		
		System.out.println(A.length()+B.length());
		System.out.println(A.compareTo(B)>0?"Yes":"No"); 
		System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1,A.length())+" "+
				B.substring(0, 1).toUpperCase()+B.substring(1,B.length()));
		
		
	}
	
	public static void main(String args[]) {
		
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        
	        m12(A, B);
	}

}
