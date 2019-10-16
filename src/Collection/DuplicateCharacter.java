package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacter {
	
	public static void duplicateCharacterMap(String s) {
		
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		
		char[] c = s.toCharArray();
		for(Character c1 : c) {
			if(m.containsKey(c1)) {
				m.put(c1, m.get(c1)+1);
			}else {
				m.put(c1, 1);
			}
		}
		
		//System.out.println("Duplicate character is :"+m);
		
		for(Map.Entry<Character, Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		
	}

	public static void main(String[] args) {
		
		String s = "Java";
		duplicateCharacterMap(s);
	}

}
