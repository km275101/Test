package Strings;

import java.util.Random;

import File.ParentTest;

public class ChildTest extends ParentTest{
	
	private final void m() {
		System.out.println("b");
	}
	
	public int add(int x, int y) {
        return (x+y);
	}
	
public static void main(String[] args) {
	ChildTest p = new ChildTest();
		 p.m();
	
	/*String r = "(787) 878-7878".replaceAll("[()\\s-]", "");
    System.out.println(r);*/
		
		
}
		

}
