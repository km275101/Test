package Comprator;

import java.util.Arrays;

public class NamesClass {
	
	 String name;
	public NamesClass(String name) {
		this.name = name;
	}
	
	public static void m1() {
		
		NamesClass n[] = new NamesClass[3];
		
		NamesClass n1 = new NamesClass("lovely");
		NamesClass n2 = new NamesClass("kammy");
		NamesClass n3 = new NamesClass("avyaan");
		n[0] = n1;
		n[1] = n2;
		n[2] = n3;
		CompratorImpl c = new CompratorImpl();
		
		Arrays.sort(n, c);
		
		System.out.println(n[0].name.toString());
		System.out.println(n[1].name.toString());
		System.out.println(n[2].name.toString());
		
		
		
	}
	
	public static void main(String args[]) {
		
		
		m1();
	}

}
