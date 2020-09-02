package Miscelleneous;

import java.util.HashMap;
import java.util.Set;

public class AnagramRevise {
	
	
	
	private static boolean findAnagram(String p1, String p2) {
		
		p1=p1.toLowerCase();
		p2=p2.toLowerCase();
		if(p1.length()!=p2.length())
		{
			return false;
		}
		char[] cp1=p1.toCharArray();
		char[] cp2=p2.toCharArray();
		HashMap<Character,Integer> hs=new HashMap<>();
		for(char cp:cp1)
		{
			if(hs.containsKey(cp))
			{
				hs.put(cp, hs.get(cp)+1);
			}
			else
			{
				hs.put(cp, 1);
			}
		}
		
		for(char cpp:cp2)
		{
			if(hs.containsKey(cpp))
			{
				hs.put(cpp, hs.get(cpp)-1);
				
			}
			else
			{
				hs.put(cpp, 1);
			}
		}
		Set<Character> s = hs.keySet();
		for(char c:s)
		{
			if(hs.get(c)>0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Boolean b = findAnagram("Silentsa", "Lisaaten");
		System.out.println(b);
	}

}
