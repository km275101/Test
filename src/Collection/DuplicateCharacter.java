package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacter {
	
	public static void duplicateCharacterMap(String s) {
		
		Map< Character, Integer> m = new HashMap<Character, Integer>();
		
		char[] c = s.toCharArray();
		for(Character c1 : c) {
			if(m.containsKey(c1)) {
				//m.get(c1)+1;
				m.put(c1, m.get(c1)+1);
			}else {
				m.put(c1, 1);
			}
		}
		
		//iterating over map.entry
		for(Map.Entry<Character, Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		
		//iterating over keySet and values()
		for(Character c1: m.keySet()) {
			System.out.println("key is :"+c1+" and value is"+m.get(c1));
		}
		for(Integer c2: m.values()) {
			System.out.println("value is :"+c2);
		}
	}

	public static void main(String[] args) {
		
		String s = "javajj";
		duplicateCharacterMap(s);
	}

}
