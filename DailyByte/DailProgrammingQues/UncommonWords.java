package DailProgrammingQues;

import java.util.HashSet;
import java.util.Set;

public class UncommonWords {
	
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