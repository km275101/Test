package ConstructorsAndStatic;

public class StaticInitaialize {
	
	
	static int count = 0; 
	
	public void test() {
		System.out.println(":::::::::"+count);
	}
	
	public StaticInitaialize() {
		count++;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StaticInitaialize t1 = new StaticInitaialize();
		t1.test();
		System.out.println(count);
		new StaticInitaialize();
		new StaticInitaialize();
		new StaticInitaialize();
		System.out.println("Increased :"+count);

	}

}
