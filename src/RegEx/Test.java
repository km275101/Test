package RegEx;

public class Test {
	
	
	
	public static void main(String args[]) {
		
		String s= "aassddd1234";
		String n = s.replaceAll("[^0-9]", "");
		
		System.out.println(n);
	}
	

}
