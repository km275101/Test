package regeEx;

import java.util.ArrayList;

public class SubStringComparisons_LexigraphExample {
	
	public static void m1(String s, int k) {
		
		String min = s.substring(0, k);
		String max = s.substring(0, k);
		ArrayList<String> al = new ArrayList<>();
		for(int i =0; i<= s.length()-k;i++) {
			
			String current = s.substring(i, i+k);
			al.add(current);
			if((min.compareTo(current)>0)) {
				min = current;
			}
			if((max.compareTo(current)<0)) {
				max = current;
			}
		}
		
		System.out.println(min);
		System.out.println(max);
		System.out.println(al);
		
	}

	public static void main(String args[]) {
		String s = "welcome tojava";
		m1(s.replaceAll(" ", ""), 3);
	}

}
