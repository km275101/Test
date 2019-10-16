package Pattern;

public class Pattern8 {
	
	public static void patternReverseTriangle(int n){
		int s = 1; int r = n-1;;
		for (int i = n+1; i <= 2*n-1; i++) {
			for (int j = 1; j <= s; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*r-1; k++) {
				System.out.print("*");
			}
			s++;
			r--;
			System.out.println();
		}
		
		
	}
	
	public static void patternTriangle(int n){
		int s = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*s-1; k++) {
				System.out.print("*");
			}
			s++;
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		
		patternTriangle(4);
		patternReverseTriangle(4);
	}

}
