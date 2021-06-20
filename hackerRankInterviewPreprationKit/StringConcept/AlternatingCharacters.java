package StringConcept;

public class AlternatingCharacters {

	static int alternatingCharacters(String s) {

		int i =0, j =1 ;
		int delete = 0;
		StringBuilder sb = new StringBuilder(s);
		while(i < sb.length()-1 ) {
			if(sb.charAt(i) == sb.charAt(j)) {
				sb.deleteCharAt(j);
				delete++;
			}else {
				i++;
				j =i+1;
			}
		}
		
		
		return delete;
		
		
	}
	
	public static void main(String[] args) {
		alternatingCharacters("AAABBB");

	}

}
