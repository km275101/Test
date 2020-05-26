package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(1,2,3));
		System.out.println(l);
		
		l.add(3);
		
		System.out.println(l);
		
	}

}
