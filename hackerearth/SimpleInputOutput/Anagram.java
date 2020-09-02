package SimpleInputOutput;

import java.util.Scanner;

public class Anagram {
	
	public static void m1(String s1, String s2) {
		
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		
		char[] ch = s1.toLowerCase().toCharArray();
		char[] ch1 = s1.toLowerCase().toCharArray();
		int count =0;
		for(int i =0; i< ch.length; i++) {
			
			for(int j =0; j< ch1.length; j++) {
				if(sb1.charAt(i) == sb2.charAt(j)) {
					count++;
				}
				
			}
		}
		
		if(count == 0) {
			System.out.println("No args");
		}
		
		int l = s1.length() + s2.length() - 2*count;
		
		System.out.println(l);
		
	}

	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        String name1 = s.nextLine(); 
	        //s.nextLine(); 
	        String name2 = s.nextLine(); 

	        m1(name1, name2);
	}

}
