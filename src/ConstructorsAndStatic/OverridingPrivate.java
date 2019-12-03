package ConstructorsAndStatic;

class A {
	int a =10;
	 public void flipper() {
		 
		 System.out.println("Hello ::"+a);
		 }
	 
}

public class OverridingPrivate extends A{
		public void flipper() {
		System.out.println("Hello1::"+a);
		}
	
	public void test() {
		System.out.println("Test overriden");
	}
	
	public static void main(String[] args) {
			new OverridingPrivate().flipper();
			
	}

}
