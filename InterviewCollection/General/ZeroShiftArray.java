package General;

import java.util.Arrays;

public class ZeroShiftArray {

	public static void m(int[] a) {
		int l = a.length;
		int k = 0;
		for (int i : a) {

			if (i != 0) {
				a[k] = i;
				k++;
			}

		}

		for (int i = k; i < a.length; i++) {
			a[i] = 0;
		}

	}
	
    
	public static void main(String[] args) {
		int[] A = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
		m(A);
		System.out.println(Arrays.toString(A));

	}

}
