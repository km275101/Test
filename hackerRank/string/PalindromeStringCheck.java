package string;

public class PalindromeStringCheck {

	static void palindrome(String s) {

		int n = s.length();

		char[] ch = s.toCharArray();

		for (int i = 0; i < n / 2; i++) {

		}

	}

	static void m1(String s) {
		int n = s.length();
		
		if(! (n%2==0)) {
			String s1 = s.substring(0,n/2);
			String s2 = s.substring(n/2+1,n);
			StringBuffer sb1 = new StringBuffer(s2);
			sb1.reverse().toString();
			String s3 = sb1.toString(); 
			if(s1.compareTo(s3)==0) {
				System.out.println("odd Palindrome");
			}
		}else {
			String s1 = s.substring(0,n/2);
			String s2 = s.substring(n/2,n);
			StringBuffer sb1 = new StringBuffer(s2);
			sb1.reverse().toString();
			String s3 = sb1.toString(); 
			if(s1.compareTo(s3)==0) {
				System.out.println("even Palindrome");
			}
		}
	}

	public static void main(String[] args) {
		m1("aabaa");
	}

}
