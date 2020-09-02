package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;

import javax.swing.event.ListSelectionEvent;



public class Test {
	static List<String> l = new ArrayList<String>();  
	
	
	public static void m1(String u) {
		
		 /*if(l.size()>0) { l.clear();}
		 l = new ArrayList<String>();  
		    l.add("FFI HR Ops Japan DataRole_V01");  
	        l.add("Matthew Losey");  
	        l.add("Mike Slessor");  
	        l.add("Matthew Losey");  
	        l.add("John Patrick Casto");  
	        
	        
	        System.out.println(l.toString());
	        Set<String> s = new HashSet<>();
	        s.add("A");
	        l = new ArrayList<>(s);
	        
	        Collections.reverse(l);
	        
	        System.out.println(l.toString()); 
	        
	        Set<String> s = new LinkedHashSet<String>(l);  
	        System.out.println(s);
	        
	        List<String> l1 = new ArrayList<>(s); 
	        Collections.reverse(l1);
	        System.out.println(l.toString());*/
		
	}
	
	public static void main(String[] args) {
		
		/*List<String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		int n = l.size();
		StringBuilder sb  = new StringBuilder();
		for(int i=0; i<n ; i++) {
			sb.append(l.get(i).toString()+" ");
		}
		System.out.println(sb.toString());
		m1("");*/
		
		String s = "17,1234.59";
		
		String s1 = s.replace(",", "");
		double i = Double.parseDouble(s1);
		
		System.out.println(i);
		if(i> 15000) {
			
			System.out.println("Hello");
		}
		
		 
		
	}

}
