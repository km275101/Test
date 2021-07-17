package DailProgrammingQues;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
	
	static int[] intersection(int[]a, int[] b){
		
		Set<Integer> s = new HashSet<>();
		Set<Integer> res = new HashSet<>();
		
		for(Integer num : a) {
			s.add(num);
		}
		for(Integer num : b) {
			if(s.contains(num)) {
				res.add(num);
			}
		}
		
		int[] x = new int[res.size()];
		int i =0;
		for(int num : res) {
			x[i++] = num;
			System.out.println(x[i-1]);
		}
		
		return x;
		
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,2,1};
		int[] b = {2,2};
		
		intersection(a, b);


	}

}
