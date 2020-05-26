package CommonPrograms;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;


  class A {
    public void printName(){
        System.out.println("Value-A");
    }
}
 class B extends A{
    public void printName(){
        System.out.println("Value-B");
    }
}


 class C extends A{
    public void printName(){
        System.out.println("Value-C");
    }
}


public class $Test {
	
	public static void newPrint(A a){
		        a.printName();
		    }
	public static void badMethod() {} 
	public static void main(String[] args) {
					A b = new A();
					A c = new B();
		         //b = c;
		         newPrint(b);
		         badMethod();
	     }
		
		
		/*Map<String, String> m = new HashMap<String, String>();
		m.put("name", "AAA");
		m.put("address", "Pune");
		m.put("langauge", "English");
		
		m.put(null, "EEE");
		m.put(null, "BBB");
		
		System.out.println(m);*/
		
	

}
