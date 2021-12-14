package randomProgram;

public class Panagram {
	
	static void pangram(String s) {
		int[] ar = new int[26];
		char[] ch = s.toLowerCase().replaceAll(" ", "").toCharArray();
		for(Character c : ch) {
			ar[c -'a']++;
		}
		
		for(Integer i : ar) {
			if(i != 1) {
				System.out.println("Not pangram");
				return;
			}
		}
		System.out.println("valid");
	}

	public static void main(String[] args) {
		String s = "qwertyuiopp lkjhg fdsa zxc vbn m";
		pangram(s);

	}

}
