package Test;

public class Test {
	public static void main(String args[]){  
		   String s1="Sachin";  
		      
		   int n = s1.length()-1;
		   System.out.println(n);
		   for(int i=n; i>=0; i--) {
			   System.out.println(s1.charAt(i));
		   }
		   
		   System.out.println("Another method");
		   StringBuilder s2 = new StringBuilder();
		   s2.append(s1);
		    s2 = s2.reverse();
		    System.out.println("String builder reverse "+s2);
		   
		  }  
}
