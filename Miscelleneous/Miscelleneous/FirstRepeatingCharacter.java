package Miscelleneous;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingCharacter {
	
	public static void m1(String s) {
		//StringBuilder sb = new StringBuilder(s);
		//int l = sb.length();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		char[] c = s.toLowerCase().toCharArray();
		
		for(Character ch : c) {
			if(m.containsKey(ch)) {
				int n = m.get(ch);
				m.put(ch, n+1);
			}else {
				m.put(ch, 1);
			}
		}
		
		
		
		for(Character ch : c) {
			
			if(m.get(ch) > 1) {
				System.out.println(ch);
				break;
			}
			
		}
		
	}

	public static void main(String[] args) {

		String s = "My name is kamy";
		
		m1("Geekfor");
		/*String[] p = s.split(" ");
		for(int i =p.length -1; i>=0; i--) {
			System.out.println(p[i]);
		}*/
	}

}
