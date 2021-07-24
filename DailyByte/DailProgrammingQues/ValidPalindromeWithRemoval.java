package DailProgrammingQues;

public class ValidPalindromeWithRemoval {

	static boolean m(String s) {
		
		int n = s.length();
		int i = 0, j= n-1;	
		
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				return isPalinrome(s, i+1, j) || isPalinrome(s, i, j-1);
			}
			i++;j--;
		}
		return true;
	}

	public static boolean isPalinrome(String s, int i, int j) {
		
     while(i < j) {
			
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;j--;
		
     }
	return true;
		
	}

	public static void main(String[] args) {
		boolean x = m("agcbbca");
		System.out.println(x);
	}
}

/**
 Given a string and the ability to delete at most one chdaracter, 
 return whether or not it can form a palindrome.
 */
