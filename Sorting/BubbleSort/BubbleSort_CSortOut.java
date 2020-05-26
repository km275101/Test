package BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BubbleSort_CSortOut {
	
	ArrayList<Integer> ar = new ArrayList<>();
	
	static void bubbleSortAsc(int A[], ArrayList<Integer> a) {
		int size = A.length;
		 
		for (int i = 0; i < size - 1; i++) {
			for (int k = 0; k < size - i - 1; k++) {
				if (A[k] > A[k + 1]) {
					int temp = A[k + 1];
					A[k + 1] = A[k];
					A[k] = temp;
					
				}
			}
		}
		
		for (int j = 0; j < size; j++) {
			
			for (int h = 0; h < a.size(); h++) {
				if(A[j] ==  a.get(h)) {
					System.out.print(a.indexOf(a.get(h))+", ");
				}
			}
		}
		
		
	}
	
	static void bubbleSortAscMap(int[] array, Map m) {
		int size = array.length;
		 
		for (int i = 0; i < size - 1; i++) {
			for (int k = 0; k < size - i - 1; k++) {
				if (array[k] > array[k + 1]) {
					int temp = array[k + 1];
					array[k + 1] = array[k];
					array[k] = temp;
					
				}
			}
		}
		
		for (int j = 0; j < size; j++) {
			System.out.print(m.get(array[j])+" ");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		//int[] array = null ; //= {4,5,3,7,1};
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] array = new int[l];
        
        for(int a=0; a<l;a++){
            array[a] = sc.nextInt();
        }
		LinkedHashMap<Double, Integer> m = new LinkedHashMap<Double, Integer>();
		int c =0;
		
		
		for(double i : array) {
			
			m.put(i, c);
			c ++;
			
		}
		
		/*for (int a = 0; a < array.length; a++) {
			ar.add((int) array[a]);
		}*/
		
		//bubbleSortAsc(array, ar);
		
		bubbleSortAscMap(array, m);
	}

}
