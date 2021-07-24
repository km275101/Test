package Strings;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TCS {

	public static void main(String[] args) {
		
			String s = m1("XOXXO", 3); // XXOXO
			System.out.println(s);
	}
	
	public static String m1(String S, int K) {
		StringBuilder sb = new StringBuilder(S);
		
		while(K > 0) {	
			
			if(sb.charAt(0)=='O')
			 { 
				 return changState(sb.charAt(0)) + m1(sb.substring(1), K-1);	 
			 } else
				 {
				  return changState(sb.charAt(0)) + m1(sb.substring(1), K-1);
				  
				 }
			
		}
		return sb.toString();			
	}
	
	
	static char changState(char c) {
		if(c == 'O') {
			c = 'X';
		}else {
			c = 'O';
		}
		return c;
	}
	
}


