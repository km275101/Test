package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class Test {
	
	
	 public static List<String> reverse(String s) {
		 List<String> list = new ArrayList<String>();
		 String[] ar = s.split(" ");
		 for(int i=ar.length-1; i>=0; i--) {
			 list.add(ar[i]);
		 }
		 System.out.println("List using loop+ "+list);
		 System.out.println("String array is : "+ar.toString());
		 for(String s1: ar) {
			 list.add(s1);
		 }
		 System.out.println("After addinginto list : "+list);
		 Collections.reverse(list);
		 System.out.println("After reversing list : "+list);
		 return list;
		 
	 }

	public static void main(String args[]) {
		/*
		 * String s1="Sachin";
		 * 
		 * int n = s1.length()-1; System.out.println(n); for(int i=n; i>=0; i--) {
		 * System.out.println(s1.charAt(i)); }
		 * 
		 * System.out.println("Another method"); StringBuilder s2 = new StringBuilder();
		 * s2.append(s1); s2 = s2.reverse();
		 * System.out.println("String builder reverse "+s2);
		 * 
		 */
		
		reverse("My name is kamlesh maurya");
	}  
}
