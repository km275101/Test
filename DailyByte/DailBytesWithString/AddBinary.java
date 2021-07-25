package DailBytesWithString;

import java.util.Scanner;

public class AddBinary {
		
	static String addBinary(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		
		int i = s1.length()-1;
		int j = s2.length()-1;
		int carry =0;
		while(i>= 0 || j>= 0) {
			int sum = carry;
			if(i>=0) sum += s1.charAt(i)-'0';
			if(j>=0) sum += s2.charAt(j)-'0';
			
			sb.append(sum%2);
			carry = sum/2; 
			i--;
			j--;
		}
		
		if(carry!=0) sb.append(carry);
		return sb.reverse().toString();
	}
	
	

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter thr binary strings");
//		String s1 = sc.next();
//		String s2 = sc.next();
//
//		System.out.println(s1 + "  " + s2);
		System.out.println(addBinary("11001", "1011"));

	}

}

/**
 * Given two binary strings (strings containing only 1s and 0s) return their sum
 * (also as a binary string). Note: neither binary string will contain leading
 * 0s unless the string itself is 0
 * 
 * Ex: Given the following binary strings...
 * 
 * "100" + "1", return "101" "11" + "1", return "100" "1" + "0", return "1"
 * 
 */