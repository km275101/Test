package General;

public class SimpleInheritanceWithAbstract {

	public static void main(String[] args) {

		hack2 h = new hack2();
		h.hack_method();
		h.hack_method2();

	}
}
	
	abstract class hack1{
		hack1(){
			System.out.println("hello");
		}
		abstract void hack_method();
		
		void hack_method2() {
			System.out.println("hi");
		}
	}
	
	class hack2 extends hack1 {
		void hack_method() {
			System.out.println("hackerearth");
			
		}
	}
	
	
/**
hello
hackerearth
hi

 * */

