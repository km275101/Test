package Java30Days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryAndMaps {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> m = new HashMap<String, Integer>();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			m.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			
			
				if(m.containsKey(s)){
					System.out.println(s+"="+m.get(s));
				
			}else {
				System.out.println("Not Found");
			}
			
		}
		in.close();
	}
}
