package Comprator;

import java.util.Comparator;

public class CompratorImpl implements Comparator<NamesClass> {
	

	@Override
	public int compare(NamesClass o1, NamesClass o2) {
		int a = o1.name.length();
		int b = o2.name.length();
		
		return ((a>b) ? -1 : (a<b) ? 1 : o1.name.compareTo(o2.name));
		
		//First method
		/*if(a>b) {
			return 1;
		}else if(a<b) {
			return -1;
		}else {
			return -o1.name.compareTo(o2.name);
		}
	*/
	
	
	}

}
