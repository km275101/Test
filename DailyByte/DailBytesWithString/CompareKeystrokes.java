package DailBytesWithString;

import java.util.Scanner;

public class CompareKeystrokes {
	
	static String deleteChar(String s1) {
		StringBuilder sb = new StringBuilder(s1);
		while(sb.indexOf("#") > 0) {
			int x = sb.indexOf("#");
			char ch = sb.charAt(x);
			sb.delete(x-1, x+1);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		//String s = "A#BC#";
		
		
		if(deleteChar(s1).equalsIgnoreCase(deleteChar(s2))) {
			System.out.println("Produces the same result");
		}else {
			System.out.println("No");
		}
		
		
	}

}

/**
Given two strings s and t, which represents a sequence of keystrokes, 
where # denotes a backspace, return whether or not the sequences produce the same result.
Ex: Given the following strings...
s = "ABC#", t = "CD##AB", return true
s = "como#pur#ter", t = "computer", return true
s = "cof#dim#ng", t = "code", return false
*/