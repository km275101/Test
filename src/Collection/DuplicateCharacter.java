package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DuplicateCharacter {
	
	public static void duplicateCharacterMap(String s) {
		
		Map< Character, Integer> m = new HashMap<Character, Integer>();
		
		char[] c = s.toCharArray();
		for(Character c1 : c) {
			if(m.containsKey(c1)) {
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
 
	public static void duplicateRegex(String s) {
		//String c = "a";
		//int count = 0;
		StringBuffer sb = new StringBuffer();
		char[] cc = s.toCharArray();
		for(Character c1 : cc) {
			int count = 0;
			Pattern p = Pattern.compile(c1.toString());
			Matcher m = p.matcher(s);
			
			while(m.find()) {
				count++;
			}
			System.out.println(c1+" "+count);
			s.replaceAll(c1.toString(), "");
		}
		}
		
	
	public static void main(String[] args) {
		
		String s = "javajj";
		duplicateRegex(s);
		//duplicateCharacterMap(s);
	}

}
