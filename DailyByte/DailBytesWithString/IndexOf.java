package DailBytesWithString;

public class IndexOf {
	
	static int m(String s, String t) {
		
		return s.indexOf(t) ;
	}

	public static void main(String[] args) {
		
		int x = m("abc", "abcd");
		System.out.println(x);

	}

}

/**
 
 Given two strings s and t, return the index of the first occurrence of t within s if it exists; otherwise, return -1.
 *
 */
 