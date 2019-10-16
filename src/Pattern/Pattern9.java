package Pattern;

public class Pattern9 {
	
	/**
	1
   12
  123
 1234
	 * */
	
	public static void patternNumber(int n){
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >=i; j--) {
				System.out.print(" ");
			}
			int s = 1;
			for (int k = 1; k <= i; k++) {
				System.out.print(s+"");
				s++;
			}
			System.out.println();
		}
	}
	
	/**
1 
1 2 
1 2 3 
1 2 3 4  
	 */
	public static void patternNumber1(int n){
		for (int i = 1; i <= n; i++) {
			int s=1;
			for (int j = 1; j <=i; j++) {
				System.out.print(s+" ");
				s++;
			}
			System.out.println();
		}
	}
	
	/**
1 
2 3 
4 5 6 
7 8 9 10 
	 * */
	public static void patternNumber2(int n){
		int s=1;
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <=i; j++) {
				System.out.print(s+" ");
				s++;
			}
			System.out.println();
		}
	}
	
	
	public static void patternNumber4(int n){
		int s = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >=i; j--) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i; k++) {
				System.out.print(s+"");
				s++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		patternNumber4(4);
	}

}
