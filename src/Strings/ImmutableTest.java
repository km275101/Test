package Strings;

public class ImmutableTest {
	
	public static void main(String args[]){
		
		String s = "immutable";
		s = s.concat("Done");
		System.out.println("String class :" + 10+20+10+s+10+20); // two objects are created and s is pointing to new object
		
		String s1 = "mutable";
		StringBuffer sb = new StringBuffer(s1);
		sb.append("Done");
		System.out.println("StringBuffer class :" +sb); // sb object is modified hence single object is present
		
		String s2 = "mutable1";
		StringBuilder sb1 = new StringBuilder(s2);
		sb1.append("Done");
		System.out.println("StringBuffer class :" +sb1); // sb1 object is modified hence single object is present
		StringBuilder s1New = sb1.reverse();
		System.out.println("Reverse :"+s1New);
		s1New.substring(2, 6);
		System.out.println("Sub string "+s1New);
		
	}

}
