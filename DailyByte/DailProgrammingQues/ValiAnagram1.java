package DailProgrammingQues;

public class ValiAnagram1 {

	public static void anagram1(String s, String t) {
		if(s.length() != t.length()) {
			System.out.println("Not an anagram");
			return;
		}
		int[] a = new int[26];
		for(int i=0; i<s.length(); i++) {
			a[s.charAt(i)-'a']++;
			a[t.charAt(i)-'a']--;
		}
		for(int i: a) {
			if(i<0) {
				System.out.println("Not an anagram");
				return;
			}
		}
		System.out.println("Vali anagram");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anagram1("silenta", "listen");

	}

}
