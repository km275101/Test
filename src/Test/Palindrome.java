package Test;

public class Palindrome {
	
	public static void main(String args[]) {
		
		int n = 1213121, r, sum = 0;
		int temp = n;
		
		while(n>0) {
			r = n%10;
			sum = sum*10 + r;
			n = n/10;
		}
		
		if (temp == sum) {
			System.out.println(sum + " Entered number is palindrome");
		}else {
			System.out.println("Number is not palindrome :"+sum);
		}
	}
	
	
	

}
