package ConstructorsAndStatic;
//the super must be first call in child class constructor
//compiler only adds super if there is default constructor is available in parent class
//if the parameterized constructor is in parent class then we have to add super in child manually otherwise CE

 class Top {
	 /*public Top() {
			System.out.println("A");
		}*/
	public Top(String s) {
		System.out.println(s);
	}
}
 
public class Overriding extends Top {
	public Overriding(String a) {
		super(a);
		System.out.println("B");
	}
	/*public Overriding(String s) {
		super(s);
		System.out.println("D");
	}*/

	public static void main(String args[]) {
		new Overriding("A");
		System.out.println(" ");
	}
}

