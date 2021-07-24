package Recursion;

public class ReverseString {

	private static void printReverse(char[] str) {
		helper(0, str);
	}

	private static void helper(int index, char[] str) {
		if (str == null || index >= str.length) {
			return;
		}
		helper(index + 1, str);
		System.out.print(str[index]);
	}
	
	private static void printReverse1(char[] str) {
		int n = str.length / 2;
		int i =0; int j = str.length-1;
		
		while(i<j) {
			char temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			i++; j--;
		}
		
		System.out.println(String.valueOf(str));
		
	}
	
	 static String reverse2(String str) {
		if (str == null || str.isEmpty() || str.length() <=1) {
			return str;
		}
		
		return reverse2(str.substring(1))+str.charAt(0);
		
	 }
	
	 

	public static void main(String[] args) {
		
		
		String str = "helloz";
		//printReverse(str.toCharArray());
		
	   //	printReverse1(str.toCharArray());
		
		String s = reverse2(str);
		System.out.println(s);

	}

}
