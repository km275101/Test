package Test;

public class Factorial {
	
	public static void main(String args[]) {
		
		int f1 = 0,f2 = 1,f3,n=10;
		for(int i=1;i<=n;i++) {
		
		
		System.out.println(f1 +",");
		f3 = f1 + f2;
		f1 = f2;
		f2 = f3;
		
	}
	}
}
