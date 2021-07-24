package DailProgrammingQues;

import java.util.Scanner;

public class CorrectCapitalization {

	static boolean capital(char c) {
		if (c >= 'A' && c < 'Z')
			return true;
		return false;
	}

	static boolean small(char c) {
		if (c >= 'a' && c < 'z')
			return true;
		return false;
	}

	static boolean m(String s) {
		char c = s.charAt(0);
		char c1 = s.charAt(1);

		if (capital(c) == true && capital(c1) == true) {
			for (int i = 2; i < s.length(); i++) {
				if (!(capital(s.charAt(i)))) {
					return false;
				}
			}

		} else if (capital(c) == true && small(c1) == true) {
			for (int i = 2; i < s.length(); i++) {
				if (!(small(s.charAt(i)))) {
					return false;
				}
			}

		} else if (small(c) == true) {
			for (int i = 1; i < s.length(); i++) {
				if (!(small(s.charAt(i)))) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String : ");
		String s = sc.next();
		
		boolean x = m(s);
		System.out.println("Result : "+x);

	}

}

/**
Given a string, return whether or not it uses capitalization correctly.
A string correctly uses capitalization if all letters are capitalized, no letters are capitalized,
or only the first letter is capitalized.
Ex: Given the following strings...
"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true
 * 
 * */
