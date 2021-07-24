package General;

import java.util.HashMap;

public class OccurencesOfCharUsingJava7 {
	
	static void m(String s) {
		HashMap<Character, Integer> m = new HashMap<>();
		char[] ch = s.toCharArray();
		for(Character c : ch) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}
			else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
	}

	public static void main(String[] args) {
		m("jjjaaavvaa");

	}

}
