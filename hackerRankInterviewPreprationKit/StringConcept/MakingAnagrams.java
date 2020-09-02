package StringConcept;



 class MakingAnagrams{

	static int makeAnagram(String a, String b) {

		char[] ch = a.toCharArray();

		StringBuilder sb1 = new StringBuilder(a);
		StringBuilder sb2 = new StringBuilder(b);
		int l1 = sb1.length();
		int l2 = sb2.length();
		int delete = 0;
		int count ;
		int charfound = 0;
		boolean found = true;
		for (int i = 0; i < l1; i++) {
			count = 0;
			sb2 = new StringBuilder(sb2);
			l2 = sb2.length();
			for (int j = 0; j < l2; j++) {
				
				if(sb1.charAt(i) == sb2.charAt(j)) {
					sb2.deleteCharAt(j);
					count++;
					charfound++;
					found = true;
					
					break;
					
				}
				
			}
			if(found) {
				delete = delete + 1;
			}
			if(count == 0){
				delete = delete + (1);
			}
			
			
			
		}
		
		
		delete = delete + (sb2.length());
		
		System.out.println(delete);
		return delete;

	}

	public static void main(String[] args) {
	    	
	    	String a = "fcrxzwscanmligyxyvym";
	    	String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

	        int res = makeAnagram(a, b);


	      //  scanner.close();
	    }

}
