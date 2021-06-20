package StringConcept;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class MakingAnagrams{

	
	static int makeAnagram1(String a, String b) {
		int delete =0 ;
		char[] ch1 = a.toLowerCase().toCharArray();
		char[] ch2 = b.toLowerCase().toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>();
		for(Character c1 : ch1) {
			if(hm.containsKey(c1)) {
				hm.put(c1, hm.get(c1)+1);
			}else {
				hm.put(c1, 1);
			}
			}
		
		for(Character c2 : ch2) {
			if(hm.containsKey(c2)) {
				hm.put(c2, hm.get(c2)-1);
			}else {
				if(hm2.containsKey(c2)) {
					hm2.put(c2, hm2.get(c2)+1);
				}else {
					hm2.put(c2, 1);
				}
			 }
			}
			
		Set<Character> hs = hm.keySet();
		Set<Character> hs2 = hm2.keySet();
		 for(Character c : hs) {
			 
				 delete = delete + Math.abs(hm.get(c));
			 
		 }
		 for(Character c1 : hs2) {
			 
				 delete = delete + hm2.get(c1);
			 
		 }
		
		
		return delete;
		
	}
	public static void main(String[] args) {
	    	
	    	String a = "fcrxzwscanmligyxyvym";
	    	String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

	        int res = makeAnagram1(a, b);
	        System.out.println(res);


	      //  scanner.close();
	    }

}
