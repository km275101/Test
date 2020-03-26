package ConstructorsAndStatic;


class Access{
	static int a =5;
	protected void m1() {
		System.out.println("In access class "+a);
		
	}
	
}

public class AccessModifier extends Access {
	
	protected void m1() {
		a++;
		System.out.println("In access modifier class "+a);
		
	}
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		am.m1();
		Access am1 = new AccessModifier();
		am1.m1();
		
	}

}
