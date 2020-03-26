package CommonPrograms;
public class Factorial {
	
	//using loop
	static double fact(int n) {
		double sum =1;
		for(int i=n;i>=1;i--) {
			sum = sum * i;
		}
		return sum;
	}
	
	//using recursion
	static double recursiveFact(int d) {
		if (d==0) 
			return 1;
			return d*recursiveFact(d-1);
	}
 
	public static void main(String[] args) {
		double fact1 = fact(5);
		double fact2 = recursiveFact(5);
		System.out.println("Factorial  is : "+fact1);
		System.out.println("Factorial  is : "+fact2);
	}

}
