package string;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringToken {
	static int count = 0;
	
	static void m1(String s) {
		 ArrayList<String> al = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(s, " !,?.\\_'@");
		while(st.hasMoreElements()) {
			count++;
			al.add(st.nextToken());
		}
		
		System.out.println(count);
		for(int i=0;i< al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

	public static void main(String[] args) {
		String s1 = "I am,k?z ammy!??";
		m1(s1);
	}

}
