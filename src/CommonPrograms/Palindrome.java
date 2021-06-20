package CommonPrograms;

import java.util.HashMap;
import java.util.Map;

public class Palindrome {
	
	public static void m1() {
		int n = 1213121, r, sum = 0;
		int temp = n;
		
		while(n>0) {
			r = n%10;
			sum = sum*10 + r;
			n = n/10;
		}
		
		if (temp == sum) {
			System.out.println(sum + " Entered number is palindrome");
		}else {
			System.out.println("Number is not palindrome :"+sum);
		}
	}
	
	public static boolean m2(String s) {
		
		int j = s.length()-1;
		for( int i =0 ; i< j; i++) {
		if(!(s.charAt(i) == s.charAt(j))) {
			return false;
		}
		j--;
		}
		return true;
	}
	
	
	public static boolean findAnagram(String s1, String s2) {
		if(! (s1.length() == s2.length())) {
			return false;
		   }else {
			
			Map<Character, Integer> m = new HashMap<Character, Integer>();
			char[] ch = s1.toCharArray();
			char[] ch1 = s2.toCharArray();
			
			for(Character c : ch) {
				if(m.containsKey(c)) {
					m.put(c, m.get(c)+1);
				}else {
					m.put(c, 1);
				}
			}
			
			for(Character c1 : ch1) {
				if(m.containsKey(c1)) {
					m.put(c1, m.get(c1)-1);
				}else {
					m.put(c1, 1);
				}
			}
			
			
			for(Map.Entry<Character, Integer> entry : m.entrySet()) {
				if (entry.getValue() > 0) {
					return false;
				}
			}
			return true;
		}
		
	}
	public static void main(String args[]) {
		Boolean b = findAnagram("listen", "silent");
		System.out.println(b);
	}
	
	
	

}
