package DailProgrammingQues;

import java.util.Scanner;

public class VacuumCleanerRoute {
	
	static void m(String s) {
		int RL = 0;
		int UD = 0;
		char[] ch = s.toCharArray();
		for(Character c : ch) {
			if(c == 'R') {
				RL++;
			}else if(c == 'L') {
				RL--;
			}else if(c == 'U'){
				UD++;
			}else {
				UD--;
			}
		}
		if( !(RL == 0 && UD == 0 )) {
			System.out.println("False");
			throw new IllegalArgumentException();
		}else {
			System.out.println("True");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = s.nextLine().toUpperCase();
		
		m(str);
		

	}

}

/**
Given a string representing the sequence of moves a robot vacuum makes,
return whether or not it will return to its original position. 
The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.

Ex: Given the following strings...

"LR", return true
"URURD", return false
"RUULLDRD", return true
 * */
