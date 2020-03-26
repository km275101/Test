package RegEx;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsecutiveOccurence {

	
	public static void regEx(String s) {
		int count =0;
		Pattern p = Pattern.compile("[a-z]+\1");
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
			count++;
		}
		System.out.println("Count is"+count);
	}
	
	public static void regEx1(String s) {
		int count =0;
		Pattern p = Pattern.compile("[.]");
		String[] ar = p.split(s);
		//System.out.println(ar);
		System.out.println("Size is : "+ar.length);
		for(String s1: ar) {
			System.out.println(s1+" ");
		}
	}
	
	public static void regEx2(String s) {
		int count =0;
		StringTokenizer st = new StringTokenizer(s, ".");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			count++;
		}
		System.out.println("Count is"+count);
	}
	
	
	public static void main(String[] args) {

		regEx("aaabbccaabbaacc");
		//regEx1("my.name.is.kamleshmaurya");
		//regEx2("my.name.is.kamleshmaurya");
	}

}
