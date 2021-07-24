package DailProgrammingQues;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class UncommonWords {
	
	public static void uncommonWordsWithHashMap(String a, String b) {
		String[] aa = a.split(" ");
		String[] bb = b.split(" ");
		
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		
		for(String s : aa){
			if(m.containsKey(s)) {
				m.put(s, m.get(s)+1);
			}else {
				m.put(s, 1);
			}
		}
		
		for(String s : bb){
			if(m.containsKey(s)) {
				m.put(s, m.get(s)+1);
			}else {
				m.put(s, 1);
			}
		}
		
//		for(Map.Entry<String, Integer> m1 : m.entrySet()) {
//			if(! (m.get(m1) > 1)) {
//				System.out.println(m1.getKey());
//			}
//		}
		System.out.print(m);
		for(String ss : m.keySet()) {if(!(m.get(ss)>1)) {
			System.out.println(ss);
		}}
	}
	
	public static void uncommonWords(String a, String b) {
		
		String[] aa = a.split(" ");
		String[] bb = b.split(" ");
		
		Set<String> s = new HashSet<>();
		Set<String> sb = new HashSet<>();
		Set<String> res = new HashSet<>();
		
		for(String s1 : aa) {
			s.add(s1);
		}
		
		for(String s1 : bb) {
			sb.add(s1);
		}
		
		for(String s1 : bb) {
			if(s.contains(s1)) {
				s.remove(s1);
				sb.remove(s1);
			}
		}
		
		
		for(String s1 : s) {
			System.out.print(s1+" ");
		}
		
		for(String s1 : sb) {
			System.out.print(s1+" ");
		}
		
	}
	
	public static void main(String[] args) {
		
//		String a ="the quick";
//		String b = "brown fox";
		
		String a ="the tortoise beat the haire";
		String b = "the tortoise lost to the haire";
		
		uncommonWords(a, b);
		uncommonWordsWithHashMap(a, b);
		
	}

}



/**
 Given two strings representing sentences, return the words that are not common to both strings 
 (i.e. the words that only appear in one of the sentences). You may assume that each sentence is a sequence of words
 (without punctuation) correctly separated using space characters.

Ex: given the following strings...

sentence1 = "the quick", sentence2 = "brown fox", return ["the", "quick", "brown", "fox"]
sentence1 = "the tortoise beat the haire", sentence2 = "the tortoise lost to the haire", return ["beat", "to", "lost"]
sentence1 = "copper coffee pot", sentence2 = "hot coffee pot", return ["copper", "hot"]
 */