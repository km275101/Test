package CommonPrograms;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class $Test {
	
	

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("name", "AAA");
		m.put("address", "Pune");
		m.put("langauge", "English");
		
		m.put(null, "EEE");
		m.put(null, "BBB");
		
		System.out.println(m);
		
	}

}
