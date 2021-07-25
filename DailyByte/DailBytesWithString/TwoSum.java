package DailBytesWithString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	static int[] twoSum(int[] a, int target) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for(int i= 0; i< a.length; i++) {	
			int diff = target - a[i];
			if(m.containsKey(diff)) {
				return new int[]{m.get(diff), i};
				
			}
			
			m.put(a[i], i);
		}
		
		
		throw new IllegalArgumentException();
		
		
	}
 
	public static void main(String[] args) {
		int[] x = {2,7,3,5,6,8,9};
		int[] y = twoSum(x,9);
		
//		for(Integer i : y) {
//			//System.out.println(i);
//			System.out.println(x[i]);
//		};
//		
		Arrays.stream(y).forEach(n -> System.out.println(n));

	}

}
