package DailBytesWithString;


public class LongestPrefix {
	
	public static void prefix(String[] s) {
		String prefix = s[0];
		for(int i=1; i<s.length; i++) {
			
			while(s[i].indexOf(prefix) !=0) {
				prefix = prefix.substring(0, prefix.length()-1);
			}
			
			
		}
		System.out.println(prefix);
	}

	public static void main(String[] args) {
 
		String[] s = {"colorado", "color", "cold"};
		prefix(s); 
	}

}
