package randomProgram;

public class ArmstrongNumber {
	static int count = 0;
	static int count(int n) {
		while(n>0) {
			n = n/10;
			count++;
		}
		return count;
	}
	
	static void armstrongNumber(int n) {
		int x = count(n);
		System.out.println(x);
		int sum =0;
		int temp = n ;
		while(n>0) {
			int digit = n%10;
			sum = (int) (sum + Math.pow(digit, x));
			n = n/10;
		}
		if(sum == temp) {
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}
	}

	public static void main(String[] args) {
		
		armstrongNumber(8208);
	}

}
