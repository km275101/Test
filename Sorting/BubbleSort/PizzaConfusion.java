package BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PizzaConfusion {

	public static void pizz(Map ar) {
		
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		HashMap<String, Integer> m = new HashMap<>();
		ArrayList<String> ar = new ArrayList<>();		
		for (int i = 0; i < T; i++) {
			String name = sc.next();
			int rating = sc.nextInt();
			m.put(name, rating);
			
		}
		
		
		pizz(m);

		/*for (int i = 0; i < ar.size(); i++) {
			pizz(ar.get(i));
		}*/

		sc.close();
	}

}
